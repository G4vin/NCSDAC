package com.example.ncsdac

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Collegiate : AppCompatActivity() {

    lateinit var Buttoncqlesson : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collegiate)

        Buttoncqlesson = findViewById(R.id.btn_cqlesson)
        Buttoncqlesson.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.inversebible.org/inverse-bible-study-guide"))
            startActivity(intent)
        }
    }
}