package com.kemilaupemenang.pad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.ImageView
import com.google.android.material.card.MaterialCardView
import com.kemilaupemenang.pad.databinding.ActivityP3kBinding

class P3kActivity : AppCompatActivity() {
    private lateinit var binding: ActivityP3kBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityP3kBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        initializeOnClickListeners()
    }

    private fun initializeOnClickListeners() {
        with(binding) {
            cardP3kPoster1.setOnClickListener {
                val intent = Intent(this@P3kActivity, P3kPoster1Activity::class.java)
                startActivity(intent)
            }
            cardP3kPoster2.setOnClickListener {
                val intent = Intent(this@P3kActivity, P3kPoster2Activity::class.java)
                startActivity(intent)
            }
            backButton.setOnClickListener {
                finish()
            }
            artikelP3k1.setOnClickListener {
                val intent = Intent(this@P3kActivity, WebViewArtikelSHEActivity::class.java)
                intent.putExtra("HTMLFILE", "artikel_she_1.html")
                startActivity(intent)
            }
            artikelP3k2.setOnClickListener {
                val intent = Intent(this@P3kActivity, WebViewArtikelSHEActivity::class.java)
                intent.putExtra("HTMLFILE", "artikel_she_2.html")
                startActivity(intent)
            }
            artikelP3k3.setOnClickListener {
                val intent = Intent(this@P3kActivity, WebViewArtikelSHEActivity::class.java)
                intent.putExtra("HTMLFILE", "artikel_she_3.html")
                startActivity(intent)
            }
            artikelP3k4.setOnClickListener {
                val intent = Intent(this@P3kActivity, WebViewArtikelSHEActivity::class.java)
                intent.putExtra("HTMLFILE", "artikel_she_4.html")
                startActivity(intent)
            }
            artikelP3k5.setOnClickListener {
                val intent = Intent(this@P3kActivity, WebViewArtikelSHEActivity::class.java)
                intent.putExtra("HTMLFILE", "artikel_she_5.html")
                startActivity(intent)
            }
            artikelP3k6.setOnClickListener {
                val intent = Intent(this@P3kActivity, WebViewArtikelSHEActivity::class.java)
                intent.putExtra("HTMLFILE", "artikel_she_6.html")
                startActivity(intent)
            }
            artikelP3k7.setOnClickListener {
                val intent = Intent(this@P3kActivity, WebViewArtikelSHEActivity::class.java)
                intent.putExtra("HTMLFILE", "artikel_she_7.html")
                startActivity(intent)
            }
            artikelP3k8.setOnClickListener {
                val intent = Intent(this@P3kActivity, WebViewArtikelSHEActivity::class.java)
                intent.putExtra("HTMLFILE", "artikel_she_8.html")
                startActivity(intent)
            }
            artikelP3k9.setOnClickListener {
                val intent = Intent(this@P3kActivity, WebViewArtikelSHEActivity::class.java)
                intent.putExtra("HTMLFILE", "artikel_she_9.html")
                startActivity(intent)
            }
        }
    }
}