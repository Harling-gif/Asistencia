package com.jafetinventos.asis

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Crear un Handler para retrasar la transición es un tipo animasion XD
        Handler().postDelayed({
            // Iniciar la nueva actividad
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
            finish() // Cerrar la actividad actual
        }, 1000) // 1000 milisegundos = 1 segundos
    }
}
