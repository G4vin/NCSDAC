package com.example.ncsdac

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class Socials : AppCompatActivity() {

    lateinit var Buttonyoutube : Button
    lateinit var Buttonfb : Button
    lateinit var Buttonig : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_socials)

        Buttonyoutube = findViewById(R.id.btn_youtube)
        Buttonyoutube.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCP83NN_mJd06suWu0PEbCqA"))
            startActivity(intent)
        }

        Buttonfb = findViewById(R.id.btn_facebook)
        Buttonfb.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/169124386525637/"))
            startActivity(intent)
        }

        Buttonig = findViewById(R.id.btn_ig)
        Buttonig.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://instagram.com/nairobicentralsda?igshid=YmMyMTA2M2Y="))
            startActivity(intent)
        }

    }
}