package com.example.ncsdac

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Baptismal : AppCompatActivity() {

    lateinit var Buttonbaptlesson : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_baptismal)

        Buttonbaptlesson = findViewById(R.id.btn_baptlesson)
        Buttonbaptlesson.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sabbathschoolpersonalministries.org/page-433"))
            startActivity(intent)
        }
    }
}