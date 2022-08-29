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
    var Buttonearliteen : Button ?= null
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
        ButtonCradA!!.setOnClickListener {
            val intent = Intent(this,CradleRollA::class.java)
            startActivity(intent)
        }

        ButtonCradB = findViewById(R.id.btn_cradB)
        ButtonCradB!!.setOnClickListener {
            val intent = Intent(this,CradleRollB::class.java)
            startActivity(intent)
        }

        ButtonKinder = findViewById(R.id.btn_kinder)
        ButtonKinder!!.setOnClickListener {
            val intent = Intent(this,Kindergaten::class.java)
            startActivity(intent)
        }

        ButtonPrimA = findViewById(R.id.btn_primA)
        ButtonPrimA!!.setOnClickListener {
            val intent = Intent(this,PrimaryA::class.java)
            startActivity(intent)
        }

        ButtonPrimB = findViewById(R.id.btn_primB)
        ButtonPrimB!!.setOnClickListener {
            val intent = Intent(this,PrimaryB::class.java)
            startActivity(intent)
        }

        ButtonJr = findViewById(R.id.btn_jr)
        ButtonJr!!.setOnClickListener {
            val intent = Intent(this,Junior::class.java)
            startActivity(intent)
        }

        Buttonearliteen = findViewById(R.id.btn_earliteen)
        Buttonearliteen!!.setOnClickListener {
            val intent = Intent(this,Earliteens::class.java)
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
        ButtonYouth!!.setOnClickListener {
            val intent = Intent(this,Youth::class.java)
            startActivity(intent)
        }

        ButtonYoungprof = findViewById(R.id.btn_young)
        ButtonYoungprof!!.setOnClickListener {
            val intent = Intent(this,Young_prof::class.java)
            startActivity(intent)
        }

        ButtonAdult = findViewById(R.id.btn_adult)
        ButtonAdult!!.setOnClickListener {
            val intent = Intent(this,Adults::class.java)
            startActivity(intent)
        }

        ButtonBapt = findViewById(R.id.btn_bapt)
        ButtonBapt!!.setOnClickListener {
            val intent = Intent(this,Baptismal::class.java)
            startActivity(intent)
        }

    }
}