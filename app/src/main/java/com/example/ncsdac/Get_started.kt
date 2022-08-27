package com.example.ncsdac

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Get_started : AppCompatActivity() {

    lateinit var Floatingmap : FloatingActionButton
    lateinit var Floatingshare : FloatingActionButton
    
    var Buttonabout : Button ?= null
    var Buttondepart : Button ?= null
    var Buttonclass : Button ?= null
    var Buttonevents : Button ?= null
    var Buttonsocials : Button ?= null
    var Buttonservices : Button ?= null
    var Buttonreferences : Button ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_started)

        Floatingshare = findViewById(R.id.floating_share)
        Floatingshare.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND)

            shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK

            shareIntent.type = "text/plain"

            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hi, This is the Nairobi Central SDA app, you have to try it out!")

            startActivity(shareIntent)
        }

        Floatingmap = findViewById(R.id.floating_map)
        Floatingmap.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Nairobi+Central+SDA+Church+-+Maxwell/@-1.2889816,36.8076987,15z/data=!4m5!3m4!1s0x0:0xc1f4dbf254097de1!8m2!3d-1.2889816!4d36.8076987"))
            startActivity(intent)
        }

        Buttonabout = findViewById(R.id.btn_about)
        Buttonabout!!.setOnClickListener {
            val intent = Intent(this,About::class.java)
            startActivity(intent)
        }

        Buttondepart = findViewById(R.id.btn_depart)
        Buttondepart!!.setOnClickListener {
            val intent = Intent(this,Departments::class.java)
            startActivity(intent)
        }

        Buttonclass = findViewById(R.id.btn_classes)
        Buttonclass!!.setOnClickListener {
            val intent = Intent(this,Sabbath_School_Classes::class.java)
            startActivity(intent)
        }

        Buttonevents = findViewById(R.id.btn_events)
        Buttonevents!!.setOnClickListener {
            val intent = Intent(this,Events::class.java)
            startActivity(intent)
        }

        Buttonsocials = findViewById(R.id.btn_socials)
        Buttonsocials!!.setOnClickListener {
            val intent = Intent(this,Socials::class.java)
            startActivity(intent)
        }

        Buttonservices = findViewById(R.id.btn_services)
        Buttonservices!!.setOnClickListener {
            val intent = Intent(this,Services::class.java)
            startActivity(intent)
        }

        Buttonreferences = findViewById(R.id.btn_references)
        Buttonreferences!!.setOnClickListener {
            val intent = Intent(this,References::class.java)
            startActivity(intent)
        }
    }
}