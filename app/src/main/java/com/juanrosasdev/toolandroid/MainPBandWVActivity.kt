package com.juanrosasdev.toolandroid

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainPBandWVActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_pband_wvactivity)
        //ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
        //    val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
        //    v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
        //    insets


        val button1 = findViewById<Button>(R.id.custom_button)

        button1.setOnClickListener{
            val intent = Intent(this,ViewMenuActivity::class.java)
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.button)

        button2.setOnClickListener{
            val intent = Intent(this,ProgressbarMenuActivity::class.java)
            startActivity(intent)
        }


    }

}
//}