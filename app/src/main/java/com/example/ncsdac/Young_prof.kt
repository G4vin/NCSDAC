package com.example.ncsdac

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Young_prof : AppCompatActivity() {

    lateinit var Buttonadultlesson : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_young_prof)

        Buttonadultlesson = findViewById(R.id.btn_adultlesson)
        Buttonadultlesson.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://absg.adventist.org/current-quarter"))
            startActivity(intent)
        }
    }
}