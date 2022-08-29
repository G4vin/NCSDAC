package com.example.ncsdac

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Departments : AppCompatActivity() {

    var Buttonamo : Button ?= null
    var Buttonwm : Button ?= null
    var Buttoncm : Button ?= null
    var Buttonyouthministry : Button ?= null
    var Buttonpath : Button ?= null
    var Buttonadventurer : Button ?= null
    var Buttonmaster : Button ?= null
    var Buttonambassador : Button ?= null
    var Buttonelder : Button ?= null
    var Buttondeacon : Button ?= null
    var Buttondeaconess : Button ?= null
    var Buttonfamily : Button ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_departments)

        Buttonamo = findViewById(R.id.btn_amo)
        Buttonamo!!.setOnClickListener {
            val intent =  Intent(this,AMO::class.java)
            startActivity(intent)
        }

        Buttonwm = findViewById(R.id.btn_wm)
        Buttonwm!!.setOnClickListener {
            val intent = Intent(this,WomenMinistry::class.java)
            startActivity(intent)
        }

        Buttoncm = findViewById(R.id.btn_cm)
        Buttoncm!!.setOnClickListener {
            val intent = Intent(this,ChildrenMinistry::class.java)
            startActivity(intent)
        }

        Buttonyouthministry = findViewById(R.id.btn_youthministry)
        Buttonyouthministry!!.setOnClickListener {
            val intent = Intent(this,YouthMinistry::class.java)
            startActivity(intent)
        }

        Buttonpath = findViewById(R.id.btn_pathfinder)
        Buttonpath!!.setOnClickListener {
            val intent = Intent(this,Pathfinders::class.java)
            startActivity(intent)
        }

        Buttonadventurer = findViewById(R.id.btn_adventurers)
        Buttonadventurer!!.setOnClickListener {
            val intent = Intent(this,Adventurers::class.java)
            startActivity(intent)
        }

        Buttonmaster = findViewById(R.id.btn_masterguide)
        Buttonmaster!!.setOnClickListener {
            val intent = Intent(this,MasterGuide::class.java)
            startActivity(intent)
        }

        Buttonambassador = findViewById(R.id.btn_amb)
        Buttonambassador!!.setOnClickListener {
            val intent = Intent(this,Ambassador::class.java)
            startActivity(intent)
        }

        Buttonelder = findViewById(R.id.btn_elders)
        Buttonelder!!.setOnClickListener {
            val intent = Intent(this,Elders::class.java)
            startActivity(intent)
        }

        Buttondeacon = findViewById(R.id.btn_deacon)
        Buttondeacon!!.setOnClickListener {
            val intent = Intent(this,Deacons::class.java)
            startActivity(intent)
        }

        Buttondeaconess = findViewById(R.id.btn_deaconess)
        Buttondeaconess!!.setOnClickListener {
            val intent = Intent(this,Deaconess::class.java)
            startActivity(intent)
        }

        Buttonfamily = findViewById(R.id.btn_familylife)
        Buttonfamily!!.setOnClickListener {
            val intent = Intent(this,FamilyLife::class.java)
            startActivity(intent)
        }
    }
}