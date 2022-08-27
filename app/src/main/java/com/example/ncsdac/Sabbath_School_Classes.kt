package com.example.ncsdac

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class Sabbath_School_Classes : AppCompatActivity() {

    var ButtonCradA : Button ?= null
    var ButtonCradB : Button ?= null
    var ButtonKinder : Button ?= null
    var ButtonPrimA : Button ?= null
    var ButtonPrimB : Button ?= null
    var ButtonJr : Button ?= null
    var ButtonEarlyteen : Button ?= null
    var ButtonTeen : Button ?= null
    var ButtonCQ : Button ?= null
    var ButtonYouth : Button ?= null
    var ButtonYoungprof : Button ?= null
    var ButtonAdult : Button ?= null
    var ButtonBapt : Button ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sabbath_school_classes)

        ButtonCradA = findViewById(R.id.btn_cradA)

        ButtonCradB = findViewById(R.id.btn_cradB)

        ButtonKinder = findViewById(R.id.btn_kinder)

        ButtonPrimA = findViewById(R.id.btn_primA)

        ButtonPrimB = findViewById(R.id.btn_primB)

        ButtonJr = findViewById(R.id.btn_jr)
        ButtonJr!!.setOnClickListener {
            val intent = Intent(this,Junior::class.java)
            startActivity(intent)
        }

        ButtonEarlyteen = findViewById(R.id.btn_earlyteen)
        ButtonEarlyteen!!.setOnClickListener {
            val intent = Intent(this,EarlyTeens::class.java)
            startActivity(intent)
        }

        ButtonTeen = findViewById(R.id.btn_teens)
        ButtonTeen!!.setOnClickListener {
            val intent = Intent(this,Teens::class.java)
            startActivity(intent)
        }

        ButtonCQ = findViewById(R.id.btn_cq)
        ButtonCQ!!.setOnClickListener {
            val intent = Intent(this,Collegiate::class.java)
            startActivity(intent)
        }

        ButtonYouth = findViewById(R.id.btn_youth)

        ButtonYoungprof = findViewById(R.id.btn_young)

        ButtonAdult = findViewById(R.id.btn_adult)
        ButtonAdult!!.setOnClickListener {
            val intent = Intent(this,Adults::class.java)
            startActivity(intent)
        }

        ButtonBapt = findViewById(R.id.btn_bapt)

    }
}