package com.example.ncsdac

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MasterGuide : AppCompatActivity() {

    lateinit var Buttonmasterweb :  Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_master_guide)

        Buttonmasterweb = findViewById(R.id.btn_masterweb)
        Buttonmasterweb.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gcyouthministries.org/leadership-training/master-guide/"))
            startActivity(intent)
        }
    }
}