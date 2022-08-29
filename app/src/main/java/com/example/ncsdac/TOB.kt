package com.example.ncsdac

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TOB : AppCompatActivity() {

    lateinit var Buttontob20 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tob)

        Buttontob20 = findViewById(R.id.btn_tob20)
        Buttontob20.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=ZHfyqR1vFhE&list=PLniVMplfrQTCJ5CXhV7GtwVRLqv6IZWLx"))
            startActivity(intent)
        }
    }
}