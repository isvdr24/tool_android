package com.juanrosasdev.toolandroid

import android.animation.ObjectAnimator
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ProgressbarHorizontalActivity : AppCompatActivity() {
    private lateinit var progressBar: ProgressBar
    private lateinit var resetButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_progressbar_horizontal)

        // Obtener referencia del ProgressBar y del botón
        progressBar = findViewById(R.id.progressBar)
        resetButton = findViewById(R.id.resetButton)

        // Configurar el máximo valor del ProgressBar
        progressBar.max = 1000

        // Valor actual del progreso
        val currentProgression = 1000

        // Animar el progreso del ProgressBar
        ObjectAnimator.ofInt(progressBar, "progress", currentProgression)
            .setDuration(2000)
            .start()

        // Configurar el listener del botón para reiniciar el ProgressBar
        resetButton.setOnClickListener {
            progressBar.progress = 0 // Reiniciar el progreso a 0

            // Animar el progreso del ProgressBar nuevamente
            ObjectAnimator.ofInt(progressBar, "progress", currentProgression)
                .setDuration(2000)
                .start()
        }
    }
}