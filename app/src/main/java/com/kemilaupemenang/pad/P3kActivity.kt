package com.kemilaupemenang.pad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.google.android.material.card.MaterialCardView

class P3kActivity : AppCompatActivity() {
    private val btnBack by lazy { findViewById<ImageView>(R.id.back_button) }
    private val cardPoster1 by lazy { findViewById<MaterialCardView>(R.id.card_p3k_poster_1) }
    private val cardPoster2 by lazy { findViewById<MaterialCardView>(R.id.card_p3k_poster_2) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_p3k)

        initializeOnClickListeners()
    }

    private fun initializeOnClickListeners() {
        cardPoster1.setOnClickListener {
            val intent = Intent(this, P3kPoster1Activity::class.java)
            startActivity(intent)
        }
        cardPoster2.setOnClickListener {
            val intent = Intent(this, P3kPoster2Activity::class.java)
            startActivity(intent)
        }
        btnBack.setOnClickListener {
            finish()
        }
    }
}