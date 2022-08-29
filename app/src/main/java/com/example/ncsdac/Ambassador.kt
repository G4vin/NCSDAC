package com.example.ncsdac

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Ambassador : AppCompatActivity() {

    lateinit var Buttonambweb : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ambassador)

        Buttonambweb = findViewById(R.id.btn_ambweb)
        Buttonambweb.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gcyouthministries.org/ministries/ambassadors/"))
            startActivity(intent)
        }
    }
}