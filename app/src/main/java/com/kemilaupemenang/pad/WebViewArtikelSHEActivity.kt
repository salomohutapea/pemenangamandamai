package com.kemilaupemenang.pad

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class WebViewArtikelSHEActivity : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view_artikel_sheactivity)

        val myWebView: WebView? = findViewById(R.id.webview_artikel_she)
        myWebView?.webViewClient = WebViewClient()
        val htmlUrl = intent.getStringExtra("HTMLFILE")

        if (htmlUrl != null) {
            myWebView?.loadUrl("file:///android_asset/$htmlUrl")
        }

        myWebView?.settings?.javaScriptEnabled = true
    }
}