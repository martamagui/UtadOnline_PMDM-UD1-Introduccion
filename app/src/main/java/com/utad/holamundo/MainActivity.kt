package com.utad.holamundo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    // Esta es la pantalla de instagram que estamos clonando:
    // https://i.insider.com/614e5e1f2fb46b0019be1e0a?width=1000&format=jpeg&auto=webp
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val exitLogo: ImageView = findViewById(R.id.iv_exit)
        val emailEditText: EditText = findViewById(R.id.et_email)
        val passwordEditText: EditText = findViewById(R.id.et_password)
        val loginButton: Button = findViewById(R.id.btn_log_in)

        val instagramLogo: ImageView = findViewById(R.id.iv_instagram_logo)
        val continueWithFacebookLayout: LinearLayout = findViewById(R.id.ll_continue_with_facebook)
        val signUpLayout: LinearLayout = findViewById(R.id.ll_new_account)
        val forgotPassword: TextView = findViewById(R.id.tv_forgot_password)

        exitLogo.setImageResource(R.drawable.ic_fb_logo)
        emailEditText.setText("mimail@live.u-tad.com")
        loginButton.setBackgroundColor(Color.RED)
        instagramLogo.alpha = 0.5f
    }
}