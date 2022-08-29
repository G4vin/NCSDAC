package com.example.ncsdac

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class YouthMinistry : AppCompatActivity() {

    lateinit var Buttonay : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youth_ministry)

        Buttonay = findViewById(R.id.btn_ay)
        Buttonay.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gcyouthministries.org/ministries/young-adults/"))
            startActivity(intent)
        }
    }
}