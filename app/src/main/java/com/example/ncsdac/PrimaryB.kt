package com.example.ncsdac

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PrimaryB : AppCompatActivity() {

    lateinit var Buttonprimlesson : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primary_b)

        Buttonprimlesson = findViewById(R.id.btn_primlesson)
        Buttonprimlesson.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gracelink.net/primary"))
            startActivity(intent)
        }

    }
}