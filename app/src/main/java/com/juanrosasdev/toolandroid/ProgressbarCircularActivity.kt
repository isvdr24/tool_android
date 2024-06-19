package com.juanrosasdev.toolandroid

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity

class ProgressbarCircularActivity : AppCompatActivity() {
    private lateinit var progressBar: ProgressBar
    private lateinit var startButton: Button
    private lateinit var stopButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progressbar_circular)

        // Inicializar las vistas
        startButton = findViewById(R.id.bt_start)
        stopButton = findViewById(R.id.bt_stop)
        progressBar = findViewById(R.id.progressBar)

        // Establecer los listeners
        startButton.setOnClickListener {
            progressBar.visibility = View.VISIBLE
        }

        stopButton.setOnClickListener {
            progressBar.visibility = View.INVISIBLE
        }
    }
}
