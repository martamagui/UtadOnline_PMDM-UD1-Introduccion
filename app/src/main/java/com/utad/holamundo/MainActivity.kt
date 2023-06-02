package com.utad.holamundo

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
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

        binding.btnLogIn.setOnClickListener {
            // Recogemos los textos con".text"  y eliminamos los espacios con ".trim()"
            val email: String = binding.etEmail.text.toString().trim()
            val password: String = binding.etPassword.text.toString().trim()

            if (email.isEmpty() == false || password.isEmpty() == false) {
                Toast.makeText(this, "Has hecho login", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Rellena todos los campos", Toast.LENGTH_SHORT).show()
            }

        }


    }
}








































