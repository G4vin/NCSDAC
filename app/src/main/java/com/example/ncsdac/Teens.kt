package com.example.ncsdac

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Teens : AppCompatActivity() {

    lateinit var Buttonteenlesson : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teens)

        Buttonteenlesson = findViewById(R.id.btn_teenslesson)
        Buttonteenlesson.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cornerstoneconnections.net/lessons"))
            startActivity(intent)
        }
    }
}