package com.utad.holamundo

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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
        }

    }
}








