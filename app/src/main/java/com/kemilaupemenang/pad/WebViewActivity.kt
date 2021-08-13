package com.kemilaupemenang.pad

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class WebViewActivity : AppCompatActivity() {
    private val myWebView: WebView by lazy { findViewById(R.id.webview_artikel_she) }

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view_artikel_sheactivity)

        myWebView.webViewClient = WebViewClient()

        val sheHTMLUrl = intent.getStringExtra("HTMLFILE")
        val articleOrPetaUrl = intent.getStringExtra("LINK")

        if (sheHTMLUrl != null) {
            myWebView.loadUrl("file:///android_asset/$sheHTMLUrl")
        }

        if (articleOrPetaUrl != null) {
            myWebView.loadUrl(articleOrPetaUrl)
        }

        myWebView.settings.javaScriptEnabled = true
    }

    override fun onBackPressed() {
        if (myWebView.canGoBack()) {
            myWebView.goBack()
        } else {
            super.onBackPressed()
        }
    }
}