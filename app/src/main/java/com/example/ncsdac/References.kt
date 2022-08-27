package com.example.ncsdac

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class References : AppCompatActivity() {

    lateinit var Buttonhymn : Button
    lateinit var Buttonegw : Button
    lateinit var ButtonBible : Button
    lateinit var Buttonhope : Button
    lateinit var Buttonadventyouth : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_references)

        Buttonhymn = findViewById(R.id.btn_hymn)
        Buttonhymn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://sdahymnal.net/"))
            startActivity(intent)
        }

        Buttonegw = findViewById(R.id.btn_egw)
        Buttonegw.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://egwwritings.org/"))
            startActivity(intent)
        }

        ButtonBible = findViewById(R.id.btn_Bible)
        ButtonBible.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kingjamesbibleonline.org/"))
            startActivity(intent)
        }

        Buttonhope = findViewById(R.id.btn_hopetv)
        Buttonhope.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hopechannel.com/au/watch"))
            startActivity(intent)
        }

        Buttonadventyouth = findViewById(R.id.btn_adventistyouth)
        Buttonadventyouth.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gcyouthministries.org/resources/sabbath-school-lesson/"))
            startActivity(intent)
        }



    }
}