package com.example.ncsdac

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Prayer : AppCompatActivity() {

    lateinit var Buttonpr40 : Button
    lateinit var Buttonpramo : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prayer)

        Buttonpr40 = findViewById(R.id.btn_pr40)
        Buttonpr40.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=CWroT4QdpWI&list=PLniVMplfrQTALrRc4GADgXMN-nQ1wNi-C"))
            startActivity(intent)
        }

        Buttonpramo = findViewById(R.id.btn_pramo)
        Buttonpramo.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=t8cyGENm15Y&list=PLniVMplfrQTCsB9Nt83dxtnpZe10wYbZe"))
            startActivity(intent)
        }
    }
}