package com.juanrosasdev.toolandroid

import android.annotation.SuppressLint
import android.graphics.Typeface
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Button
import android.content.Intent
import androidx.annotation.ColorRes
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.google.android.material.switchmaterial.SwitchMaterial

class Ejemplo1 : AppCompatActivity() {
    private lateinit var text: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejemplo1)

        //boton para volver a la interfaz principal
        val buttonBack: Button = findViewById(R.id.buttonBack1)
        buttonBack.setOnClickListener {
            startActivity(Intent(this, ListElements::class.java))
        }

        //boton para ir a la intefaz siguiente (ver codigo kotlin)
        val buttonKotlin: Button = findViewById(R.id.buttonKotlin)
        buttonKotlin.setOnClickListener {
            startActivity(Intent(this, ImageEj1Ko::class.java))
        }

        //boton para ir a la intefaz siguiente (ver codigo xml)
        val buttonXml: Button = findViewById(R.id.buttonXml)
        buttonXml.setOnClickListener {
            startActivity(Intent(this, ImageEj1Xm::class.java))
        }




        text = findViewById(R.id.textView)

        setupItalicSwitch()
        setupHighlightedSwitch()
        setupRadioGroup()
    }

    //El switch_italic le da formato italico al texto
    private fun setupItalicSwitch() {
        val italicSwitch: SwitchMaterial = findViewById(R.id.switch_italic_format)

        italicSwitch.setOnCheckedChangeListener { _, isChecked ->
            val typeface = if (isChecked) Typeface.ITALIC else Typeface.NORMAL
            text.setTypeface(null, typeface)
        }
    }

    //El switch_color cambia el color al texto
    private fun setupHighlightedSwitch() {
        val colorSwitch: SwitchMaterial = findViewById(R.id.switch_color)

        colorSwitch.setOnCheckedChangeListener { _, isChecked ->
            val colorRes = if (isChecked) R.color.green_500 else R.color.black
            text.setTextColor(getColorValue(colorRes))
        }
    }

    private fun getColorValue(@ColorRes colorRes: Int): Int {
        return ContextCompat.getColor(this, colorRes)
    }

    private fun setupRadioGroup() {
        val contenedor: RadioGroup = findViewById(R.id.grupo_dias)
        val opcionI2: RadioButton = contenedor.getChildAt(2) as RadioButton
        opcionI2.isChecked = true
    }
}