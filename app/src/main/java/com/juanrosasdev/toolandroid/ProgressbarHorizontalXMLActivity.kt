package com.juanrosasdev.toolandroid

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProgressbarHorizontalXMLActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_progressbar_horizontal_xmlactivity)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Código XML a mostrar en el TextView
        val xmlCode = """
            
                <?xml version="1.0" encoding="utf-8"?>
                <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
                    xmlns:app="http://schemas.android.com/apk/res-auto"
                    xmlns:tools="http://schemas.android.com/tools"
                    android:id="@+id/main"
                    android:layout_width="match_parent"
                    android:layout_height="match_parent"
                    tools:context=".ProgressbarHorizontalActivity">
                
                    <ProgressBar
                        android:id="@+id/progressBar"
                        style="?android:attr/progressBarStyleHorizontal"
                        android:layout_width="200dp"
                        android:layout_height="wrap_content"
                        android:scaleY="4"
                        android:layout_centerInParent="true" />
                
                </RelativeLayout>
                
        """.trimIndent()

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = xmlCode
    }
}
