package com.juanrosasdev.toolandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
<<<<<<< HEAD


=======
        funciondeprueba()
    }
    private fun funciondeprueba(){
        Toast.makeText(this, "Esto es una prueba", Toast.LENGTH_SHORT).show()
>>>>>>> 2803ba91362038f0ecbb5f16cc422c77b172df73
    }


}