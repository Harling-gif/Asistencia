package com.jafetinventos.asis

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)  // Asegúrate de que este layout

        val guardarButton: Button = findViewById(R.id.rectangle_7)
        guardarButton.setOnClickListener {
            // Cambia a la nueva pantalla (EstudianteActivity)
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)  // Inicia la nueva actividad
        }

    }
}

