package com.example.ncsdac

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EarlyTeens : AppCompatActivity() {

    lateinit var Buttonearlylesson : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_early_teens)

        Buttonearlylesson = findViewById(R.id.btn_earlyteen)
        Buttonearlylesson.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.realtimefaith.net/"))
            startActivity(intent)
        }
    }
}