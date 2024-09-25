package com.jafetinventos.asis


import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // boton docente
        val docenteTextView: TextView = findViewById(R.id.docente)
        docenteTextView.setOnClickListener {
            Toast.makeText(this, "Función Docente ", Toast.LENGTH_SHORT).show()
        }

        // botón estudiante
        val estudianteTextView: TextView = findViewById(R.id.estudiante)
        estudianteTextView.setOnClickListener {
            // Cambia a la nueva pantalla (EstudianteActivity)
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)  // Inicia la nueva actividad
        }
    }
}
