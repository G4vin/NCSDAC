package com.example.ncsdac

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Junior : AppCompatActivity() {

    lateinit var Buttonjrlesson : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_junior)

        Buttonjrlesson = findViewById(R.id.btn_jrlesson)
        Buttonjrlesson.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.juniorpowerpoints.org/page2447"))
            startActivity(intent)
        }
    }
}