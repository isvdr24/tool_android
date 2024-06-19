package com.juanrosasdev.toolandroid

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ViewMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_view_menu)

        val button1 = findViewById<Button>(R.id.button8)

        button1.setOnClickListener{
            val intent = Intent(this,ViewActivity::class.java)
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.button9)

        button2.setOnClickListener{
            val intent = Intent(this,ViewXMLActivity::class.java)
            startActivity(intent)
        }

        val button3 = findViewById<Button>(R.id.button10)

        button3.setOnClickListener{
            val intent = Intent(this,ViewKotlinActivity::class.java)
            startActivity(intent)
        }


        }
    }