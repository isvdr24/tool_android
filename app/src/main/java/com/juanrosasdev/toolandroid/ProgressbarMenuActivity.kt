package com.juanrosasdev.toolandroid

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProgressbarMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_progressbar_menu)


        val button1 = findViewById<Button>(R.id.button2)

        button1.setOnClickListener{
            val intent = Intent(this,ProgressbarCircularActivity::class.java)
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.button3)

        button2.setOnClickListener{
            val intent = Intent(this,ProgressbarHorizontalActivity::class.java)
            startActivity(intent)
        }

        val button3 = findViewById<Button>(R.id.button4)

        button3.setOnClickListener{
            val intent = Intent(this,ProgressbarCircularXMLActivity::class.java)
            startActivity(intent)
        }

        val button4 = findViewById<Button>(R.id.button5)

        button4.setOnClickListener{
            val intent = Intent(this,ProgressbarHorizontalXMLActivity::class.java)
            startActivity(intent)
        }

        val button5 = findViewById<Button>(R.id.button6)

        button5.setOnClickListener{
            val intent = Intent(this,ProgressbarCircularKotlinActivity::class.java)
            startActivity(intent)
        }

        val button6 = findViewById<Button>(R.id.button7)

        button6.setOnClickListener{
            val intent = Intent(this,ProgressbarHorizontalKotlinActivity::class.java)
            startActivity(intent)
        }


        }
    }
