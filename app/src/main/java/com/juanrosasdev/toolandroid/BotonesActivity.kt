package com.juanrosasdev.toolandroid

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class BotonesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_botones)

        // Definir los btn de activity_botones por id
        val btnToast = findViewById<Button>(R.id.btnToast)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)

        // Configurando los botones para los mensajes toast
        btnToast.setOnClickListener {
            Toast.makeText(this, "Bienvenidos", Toast.LENGTH_SHORT).show()
        }

        button2.setOnClickListener {
            Toast.makeText(this, "Gracias", Toast.LENGTH_SHORT).show()
        }

        button3.setOnClickListener {
            Toast.makeText(this, "Siguiente", Toast.LENGTH_SHORT).show()
        }

        button4.setOnClickListener {
            Toast.makeText(this, "Adelante", Toast.LENGTH_SHORT).show()
        }
    }
}






