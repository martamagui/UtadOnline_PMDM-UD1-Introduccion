package com.utad.holamundo

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.utad.holamundo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(
            "ESTADO", "La activity pasa a -> onCreate\n" +
                    " - Se crea la Activity por primera vez\n"
        )
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

        binding.tvSignUp.setOnClickListener { navigateToSignUp() }
    }

    private fun navigateToSignUp() {
        val intent = Intent(this, SignUpActivity::class.java)
        startActivity(intent)
    }


    //----------- ESTADOS DE LA ACTIVITY -------------
    override fun onStart() {
        super.onStart()
        Log.d(
            "ESTADO", "La activity pasa a -> onStart()\n" +
                    " - La Activity inicia, pero no es interactiva\n" +
                    " - La app se está preparando para que el usuario pueda interactuar."
        )
    }

    override fun onResume() {
        super.onResume()
        Log.d(
            "ESTADO", "La activity pasa a -> onResume()\n" +
                    " - La Activity se hace interactiva"
        )
    }

    override fun onPause() {
        super.onPause()
        Log.d(
            "ESTADO", "La activity pasa a -> onPause()\n" +
                    "  - La activity ya no se ve \n" +
                    "  - Pasará a onStop"
        )
    }

    override fun onStop() {
        super.onStop()
        Log.d(
            "ESTADO", "La activity pasa a -> onStop()\n" +
                    " - El usuario ya no puede ver la actividad\n" +
                    " - Conserva su estado y puede volver a ser instanciada"
        )
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(
            "ESTADO", "La activity pasa a -> onDestroy()\n" +
                    " - Se llama antes de que la actividad sea eliminada por completo"
        )
    }
}








































