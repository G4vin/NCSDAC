package com.example.ncsdac

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Kindergaten : AppCompatActivity() {

    lateinit var  Buttongracelink : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kindergaten)

        Buttongracelink = findViewById(R.id.btn_kinderlesson)
        Buttongracelink.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gracelink.net/kindergarten"))
            startActivity(intent)
        }
    }
}