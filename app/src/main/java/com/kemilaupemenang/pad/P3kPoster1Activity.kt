package com.kemilaupemenang.pad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.github.chrisbanes.photoview.PhotoView

class P3kPoster1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_p3k_poster1)

        val photoView1 = findViewById<View>(R.id.poster_p3k_1) as PhotoView
        val btnBack = findViewById<ImageView>(R.id.back_button)

        photoView1.setImageResource(R.drawable.poster_p3k_1)

        btnBack.setOnClickListener {
            finish()
        }
    }
}