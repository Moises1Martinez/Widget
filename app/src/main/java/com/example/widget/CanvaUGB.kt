package com.example.widget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_canva_ugb.*
import kotlinx.android.synthetic.main.activity_portal_ugb.*

class CanvaUGB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_canva_ugb)
        canvaweb.webChromeClient = object : WebChromeClient(){

        }

        canvaweb.webViewClient= object : WebViewClient(){

        }
        val settings: WebSettings = canvaweb.settings
        settings.javaScriptEnabled=true

        //Se usa el portal del estudiante redirigiendo a la calendarización
        canvaweb.loadUrl("https://ugb.instructure.com")
    }
}