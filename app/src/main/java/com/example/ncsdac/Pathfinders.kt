package com.example.ncsdac

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Pathfinders : AppCompatActivity() {

    lateinit var Buttonpathyweb : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pathfinders)

        Buttonpathyweb = findViewById(R.id.btn_pathyweb)
        Buttonpathyweb.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gcyouthministries.org/ministries/pathfinders/"))
            startActivity(intent)
        }
    }
}