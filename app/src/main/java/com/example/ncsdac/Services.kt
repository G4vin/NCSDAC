package com.example.ncsdac

import android.content.Intent
import  androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Services : AppCompatActivity() {

    var Buttontithe : Button ?= null
    var Buttoncontact : Button ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_services)

        Buttontithe = findViewById(R.id.btn_tithe)
        Buttontithe!!.setOnClickListener {
            val intent = Intent(this,Tithe::class.java)
            startActivity(intent)
        }

        Buttoncontact = findViewById(R.id.btn_contact)
        Buttoncontact!!.setOnClickListener {
            val intent = Intent(this, Contact::class.java)
            startActivity(intent)
        }
    }
}