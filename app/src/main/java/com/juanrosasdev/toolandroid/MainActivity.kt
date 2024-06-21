package com.juanrosasdev.toolandroid

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity<button> : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        funciondeprueba()
    }
    private fun funciondeprueba(){
        Toast.makeText(this, "Esto es una prueba", Toast.LENGTH_SHORT).show()
    }
}
