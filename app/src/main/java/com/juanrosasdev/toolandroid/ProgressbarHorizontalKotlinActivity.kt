package com.juanrosasdev.toolandroid

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ProgressbarHorizontalKotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_progressbar_horizontal_kotlin)

        // Código Kotlin a mostrar en el TextView
        val kotlinCode = """
            
                import android.animation.ObjectAnimator
                import android.os.Bundle
                import android.widget.ProgressBar
                import androidx.activity.enableEdgeToEdge
                import androidx.appcompat.app.AppCompatActivity
                
                class ProgressbarHorizontalActivity : AppCompatActivity() {
                
                    private lateinit var progressBar: ProgressBar
                
                    override fun onCreate(savedInstanceState: Bundle?) {
                        super.onCreate(savedInstanceState)
                        enableEdgeToEdge()
                        setContentView(R.layout.activity_progressbar_horizontal)
                
                        progressBar = findViewById(R.id.progressBar)
                
                        progressBar.max = 1000
                
                        val currentProgression = 1000
                
                        ObjectAnimator.ofInt(progressBar, "progress", currentProgression)
                            .setDuration(2000)
                            .start()
                
                        }
                    }
                    
        """.trimIndent()

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = kotlinCode
    }
}
