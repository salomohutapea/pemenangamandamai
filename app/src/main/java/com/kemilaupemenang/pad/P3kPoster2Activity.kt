package com.kemilaupemenang.pad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.github.chrisbanes.photoview.PhotoView

class P3kPoster2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_p3k_poster2)

        val photoView2 = findViewById<View>(R.id.poster_p3k_2) as PhotoView
        val btnBack = findViewById<ImageView>(R.id.back_button)

        photoView2.setImageResource(R.drawable.poster_p3k_2)

        btnBack.setOnClickListener {
            finish()
        }
    }
}