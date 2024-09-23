package com.jafetinventos.asis

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

        // boton estudiante
        val estudianteTextView: TextView = findViewById(R.id.estudiante)
        estudianteTextView.setOnClickListener {
            Toast.makeText(this, "Funciona Estudiante", Toast.LENGTH_SHORT).show()
        }
    }
}
