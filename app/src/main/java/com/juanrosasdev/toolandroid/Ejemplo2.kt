package com.juanrosasdev.toolandroid

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.Toast
import android.widget.ToggleButton
import android.widget.Button
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

class Ejemplo2 : AppCompatActivity() {
    private lateinit var checkboxSeleccion: CheckBox

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejemplo2)

        //boton para volver a la interfaz principal
        val buttonBack: Button = findViewById(R.id.buttonBack2)
        buttonBack.setOnClickListener {
            startActivity(Intent(this, ListElements::class.java))
        }

        //boton para ir a la intefaz siguiente (ver codigo kotlin)
        val buttonKotlin: Button = findViewById(R.id.buttonKotlin)
        buttonKotlin.setOnClickListener {
            startActivity(Intent(this, ImageEj2Ko::class.java))
        }

        //boton para ir a la intefaz siguiente (ver codigo xml)
        val buttonXml: Button = findViewById(R.id.buttonXml)
        buttonXml.setOnClickListener {
            startActivity(Intent(this, ImageEj2Xm::class.java))
        }




        checkboxSeleccion = findViewById(R.id.checkbox_marcado)


        //Esto hace que aparezca "Botón ON" o "Botón OFF"
        val toggle: ToggleButton = findViewById(R.id.toggleButton)
        toggle.setOnCheckedChangeListener { _, isChecked ->
            Toast.makeText(this, if (isChecked) "Boton ON" else "Boton OFF", Toast.LENGTH_SHORT).show()
        }

    }

    //mensaje de estado de checkbox
    fun loguearCheckbox(v: View) {
        val estado = if (checkboxSeleccion.isChecked) "Marcado" else "No Marcado"
        Toast.makeText(this, "Estado: $estado", Toast.LENGTH_LONG).show() }
}