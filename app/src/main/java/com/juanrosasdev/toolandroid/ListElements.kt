package com.juanrosasdev.toolandroid

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

//En esta clase mostramos en una lista los 2 ejemplos.
class ListElements : AppCompatActivity() {

    // Inicializa la actividad y establece el diseño
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_element)

        val listView: ListView = findViewById(R.id.listView)

        // Definiendo los dos ítems de la lista
        val items = arrayOf("Ejemplo 1 (RadioButton-RadioGroup-Switch)", "Ejemplo 2 (Checkbox-ToggleButton)")

        // Creando el ArrayAdapter
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, items)

        // Asignando el adaptador al ListView
        listView.adapter = adapter

        // Configurando el listener para los clics en los ítems del ListView
        listView.setOnItemClickListener { _, _, position, _ ->
            when (position) {
                0 -> startActivity(Intent(this, Ejemplo1::class.java))
                1 -> startActivity(Intent(this, Ejemplo2::class.java))
            }
        }
    }
}
