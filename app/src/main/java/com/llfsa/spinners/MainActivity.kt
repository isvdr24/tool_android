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
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Configurar el Spinner
        val spinner: Spinner = findViewById(R.id.niceSpinnerXml)
        ArrayAdapter.createFromResource(
            this,
            R.array.countries_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }

        // Configurar botones para navegar a otras actividades
        val xmlButton: Button = findViewById(R.id.button)
        xmlButton.setOnClickListener {
            val intent = Intent(this, codigoxmlActivity::class.java)
            startActivity(intent)
        }

        val kotlinButton: Button = findViewById(R.id.button3)
        kotlinButton.setOnClickListener {
            val intent = Intent(this, codigokotlinActivity::class.java)
            startActivity(intent)
        }
    }
}