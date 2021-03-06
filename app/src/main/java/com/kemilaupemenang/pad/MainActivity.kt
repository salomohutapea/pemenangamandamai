package com.kemilaupemenang.pad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.github.chrisbanes.photoview.PhotoView
import com.google.android.material.card.MaterialCardView

class MainActivity : AppCompatActivity() {
    private val cardP3k by lazy { findViewById<MaterialCardView>(R.id.card_p3k) }
    private val cardArtikel by lazy { findViewById<MaterialCardView>(R.id.card_artikel) }
    private val cardPetaBencana by lazy { findViewById<MaterialCardView>(R.id.card_peta) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeOnClickListeners()
    }

    private fun initializeOnClickListeners() {
        cardP3k.setOnClickListener {
            val intent = Intent(this, P3kActivity::class.java)
            startActivity(intent)
        }
        cardArtikel.setOnClickListener {
            val intent = Intent(this, WebViewActivity::class.java)
            intent.putExtra(
                "LINK",
                "https://visitpemenang.com/bangkit-pemenang/#artikel-bencana/"
            )
            startActivity(intent)

//            Toast.makeText(
//                this, "Artikel Pemenang Aman Damai",
//                Toast.LENGTH_LONG
//            ).show()
        }
        cardPetaBencana.setOnClickListener {
            val intent = Intent(this, WebViewActivity::class.java)
            intent.putExtra(
                "LINK",
                "https://visitpemenang.com/bangkit-pemenang/#peta-rawan-bencana/"
            )
            startActivity(intent)

//            Toast.makeText(
//                this, "Artikel Pemenang Aman Damai",
//                Toast.LENGTH_LONG
//            ).show()
        }
    }
}