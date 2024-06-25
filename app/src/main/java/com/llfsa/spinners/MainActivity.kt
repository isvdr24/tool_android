package com.llfsa.spinners

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Habilitar el modo "Edge-to-Edge" para aprovechar la pantalla completa
        enableEdgeToEdge()

        // Establecer el layout de la actividad
        setContentView(R.layout.activity_main)

        // Ajustar el padding del layout principal para que no se solapen con las barras del sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets // Devolver los insets modificados
        }

        // Configurar el Spinner con datos de un array definido en recursos
        val spinner: Spinner = findViewById(R.id.niceSpinnerXml)
        ArrayAdapter.createFromResource(
            this,
            R.array.countries_array, // Array definido en res/values/arrays.xml
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }

        // Configurar botón para navegar a otra actividad (codigoxmlActivity)
        val xmlButton: Button = findViewById(R.id.button)
        xmlButton.setOnClickListener {
            val intent = Intent(this, codigoxmlActivity::class.java)
            startActivity(intent)
        }

        // Configurar botón para navegar a otra actividad (codigokotlinActivity)
        val kotlinButton: Button = findViewById(R.id.button3)
        kotlinButton.setOnClickListener {
            val intent = Intent(this, codigokotlinActivity::class.java)
            startActivity(intent)
        }
    }
}
