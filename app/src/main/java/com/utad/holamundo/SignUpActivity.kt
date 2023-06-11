package com.utad.holamundo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import com.utad.holamundo.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSignUp.setOnClickListener {
            val username: String = binding.etUserName.text.toString()
            val password: String = binding.etPassword.text.toString()
            val description: String = binding.etUserDescription.text.toString()
            navigateToProfile(username, password, description)
        }
    }

    private fun navigateToProfile(
        userNameValue: String,
        passwordValue: String,
        descriptionValue: String
    ) {
        val intent: Intent = Intent(this, ProfileActivity::class.java)
        intent.putExtra("username", userNameValue)
        intent.putExtra("password", passwordValue)
        intent.putExtra("description", descriptionValue)

        startActivity(intent)
    }

}























