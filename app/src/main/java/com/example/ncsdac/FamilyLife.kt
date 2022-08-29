package com.example.ncsdac

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FamilyLife : AppCompatActivity() {

    lateinit var Buttonfamlifeweb : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_family_life)

        Buttonfamlifeweb = findViewById(R.id.btn_famlifeweb)
        Buttonfamlifeweb.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW , Uri.parse("https://family.adventist.org/"))
            startActivity(intent)
        }
    }
}