package com.utad.holamundo

import android.content.Intent
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

        if (intent.hasExtra("username") && intent.hasExtra("username") && intent.hasExtra("description")) {
            val userName = intent.getStringExtra("username")
            val password = intent.getStringExtra("password")
            val description = intent.getStringExtra("description")

            Log.i(
                "ProfileAct.",
                "userName: $userName, password: $password, description: $description"
            )
        }

    }
}








