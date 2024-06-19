package com.juanrosasdev.toolandroid

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProgressbarCircularKotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_progressbar_circular_kotlin)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Código a mostrar en el TextView
        val code = """

            import android.os.Bundle
            import android.view.View
            import android.widget.ProgressBar
            import androidx.appcompat.app.AppCompatActivity
            
            class ProgressbarCircularActivity : AppCompatActivity() {
            
                private lateinit var progressBar: ProgressBar
            
                override fun onCreate(savedInstanceState: Bundle?) {
                    super.onCreate(savedInstanceState)
                    setContentView(R.layout.activity_progressbar_circular)
            
                    progressBar = findViewById(R.id.progressBar)
            
                    }
                }
            
        """.trimIndent()

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = code
    }
}
