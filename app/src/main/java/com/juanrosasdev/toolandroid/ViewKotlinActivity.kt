package com.juanrosasdev.toolandroid

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ViewKotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_view_kotlin)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Código a mostrar en el TextView
        val code = """

            import android.os.Bundle
            import android.webkit.WebChromeClient
            import android.webkit.WebSettings
            import android.webkit.WebView
            import android.webkit.WebViewClient
            import androidx.activity.enableEdgeToEdge
            import androidx.appcompat.app.AppCompatActivity

            class ViewActivity : AppCompatActivity() {
                override fun onCreate(savedInstanceState: Bundle?) {
                    super.onCreate(savedInstanceState)
                    enableEdgeToEdge()
                    setContentView(R.layout.activity_view)

                    val visor = findViewById<WebView>(R.id.web)

                    visor.webChromeClient = object : WebChromeClient() {}

                    visor.webViewClient = object : WebViewClient() {}

                    val settings: WebSettings = visor.settings
                    settings.javaScriptEnabled = true

                    visor.loadUrl("https://www.google.com.ar/")
                }
            }
        """.trimIndent()

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = code
    }
}
