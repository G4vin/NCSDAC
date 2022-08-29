package com.example.ncsdac

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Adventurers : AppCompatActivity() {

    lateinit var Buttonadventureweb : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adventurers)

        Buttonadventureweb = findViewById(R.id.btn_adventurerweb)
        Buttonadventureweb.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gcyouthministries.org/ministries/adventurers/"))
            startActivity(intent)
        }
    }
}