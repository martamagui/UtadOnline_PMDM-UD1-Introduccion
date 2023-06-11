package com.utad.holamundo

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bumptech.glide.Glide
import com.utad.holamundo.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (intent.hasExtra("user")) {
            var user: User? = null

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                user = intent.getParcelableExtra<User>("user", User::class.java)
            } else {
                user = intent.getParcelableExtra("user")
            }
            Log.i(
                "ProfileAct.",
                "userName: ${user?.userName}, password: ${user?.password}, description: ${user?.description}"
            )
            binding.tvUserName.text = user?.userName
            binding.tvUserNameSmall.text = user?.userName
            binding.tvUserDescription.text = user?.description
        }

        val avatarUrl = "https://static.wikia.nocookie.net/meme/images/5/52/Polite_Cat-0.jpg/revision/latest?cb=20200611120017"

        Glide
            .with(this)
            .load(avatarUrl)
            .error(com.google.android.material.R.drawable.mtrl_ic_error)
            .placeholder(R.drawable.ic_instagram_logo)
            .circleCrop()
            .into(binding.ivAvatar)



    }
}








