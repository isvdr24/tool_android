package com.juanrosasdev.toolandroid

import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_view)
        // ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
        //     val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
        //    v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
        //     insets

        val visor = findViewById<WebView>(R.id.web)

        visor.webChromeClient = object : WebChromeClient(){

        }

        visor.webViewClient = object : WebViewClient(){


        }

        val settings: WebSettings = visor.settings
        settings.javaScriptEnabled = true

        visor.loadUrl("https://www.google.com.ar/")

    }
}
//}