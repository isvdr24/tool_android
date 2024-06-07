package com.juanrosasdev.toolandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        funciondeprueba()
    }

    private fun funciondeprueba(){
        Toast.makeText(this, "Esto es una prueba", Toast.LENGTH_SHORT).show()
    }
}
