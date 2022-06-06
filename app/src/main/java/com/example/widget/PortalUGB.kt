package com.example.widget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_portal_ugb.*


class PortalUGB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_portal_ugb)
        portalweb.webChromeClient = object : WebChromeClient(){

        }

        portalweb.webViewClient= object : WebViewClient(){

        }
        val settings: WebSettings = portalweb.settings
        settings.javaScriptEnabled=true

        //Se usa el portal del estudiante redirigiendo a la calendarización
        portalweb.loadUrl("https://estudiantes.ugb.edu.sv/Notas")
    }
}