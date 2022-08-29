package com.example.ncsdac

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Events : AppCompatActivity() {

    var Buttoncamp : Button ?= null
    var Buttonvbs : Button ?= null
    var Buttontob : Button ?= null
    var Buttonprayer : Button ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_events)

        Buttoncamp = findViewById(R.id.btn_camp)
        Buttoncamp!!.setOnClickListener {
            val intent = Intent(this,CampMeeting::class.java)
            startActivity(intent)
        }

        Buttonvbs = findViewById(R.id.btn_vbs)
        Buttonvbs!!.setOnClickListener {
            val intent = Intent(this,VBS::class.java)
            startActivity(intent)
        }

        Buttontob = findViewById(R.id.btn_treasures)
        Buttontob!!.setOnClickListener {
            val intent = Intent(this,TOB::class.java)
            startActivity(intent)
        }

        Buttonprayer = findViewById(R.id.btn_prayer)
        Buttonprayer!!.setOnClickListener {
            val intent = Intent(this,Prayer::class.java)
            startActivity(intent)
        }


    }
}