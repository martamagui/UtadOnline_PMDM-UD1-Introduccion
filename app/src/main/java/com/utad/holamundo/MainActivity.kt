package com.utad.holamundo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.utad.holamundo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        /*
        Todos los cambios que hagamos en la vista
        deben hacerse SIEMPRE DESPUÉS DEL "setContentView()".
        Si no, dará error.
         */
        binding.ivExit.setImageResource(R.drawable.ic_fb_logo)
        binding.etEmail.setText("mimail@live.u-tad.com")
        binding.ivInstagramLogo.alpha = 0.5f
        binding.btnLogIn.setBackgroundColor(Color.RED)
    }
}








































