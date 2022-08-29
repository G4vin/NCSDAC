package com.example.ncsdac

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Earliteens : AppCompatActivity() {

    lateinit var Buttonrealtime : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_earliteens)

        Buttonrealtime = findViewById(R.id.btn_realtime)
        Buttonrealtime.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.realtimefaith.net/"))
            startActivity(intent)
        }
    }
}