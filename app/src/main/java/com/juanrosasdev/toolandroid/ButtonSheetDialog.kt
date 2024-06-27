package com.juanrosasdev.toolandroid

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import com.google.android.material.bottomsheet.BottomSheetDialog
import android.view.View
import android.widget.TextView

class ButtonSheetDialog : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_button_sheet_dialog)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val MostrarButtonSheetDialog: Button = findViewById(R.id.btnDesplegar)
        MostrarButtonSheetDialog.setOnClickListener{
            mostrarButtonSheetDialog()
        }
    }

        private fun mostrarButtonSheetDialog() {
            val buttonSheetDialog = BottomSheetDialog(this)
            val buttonSheetView = layoutInflater.inflate(R.layout.activity_button_sheet_dialog, null)
            buttonSheetDialog.setContentView(buttonSheetView)
            buttonSheetView.findViewById<Button>(R.id.btnCerrar).setOnClickListener {// se agrega el evento "setOnClikListener" al boton "btnCerrar"
                buttonSheetDialog.dismiss() // el metodo dismiss sirve para cerrar el buttonsheet emergente
            }
            //   val mensaje: TextView = findViewById(R.id.txtMensaje)
            // buttonSheetDialog.setContentView(mensaje)
            buttonSheetDialog.show()
        }
}