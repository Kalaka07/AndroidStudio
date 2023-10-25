package com.example.practica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.prueba)
        for(valor in 0 .. 10){
        val resultado = when(valor.toDouble()){
            in 0.0 .. 4.5 -> "Suspenso"
            in 4.5..6.0 -> "Suficiente"
            in 6.0..8.0 -> "Notable"
            in 8.0..10.0 -> "Excelente"
            else -> "Nota fuera de rango"
        }
            textView.append("Nota: $valor - $resultado\n")
        }

    }
}