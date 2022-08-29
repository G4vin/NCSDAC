package com.example.ncsdac

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Create_acc : AppCompatActivity() {

    lateinit var edt_createname : EditText
    lateinit var edt_age : EditText
    lateinit var edt_phonenumber : EditText
    lateinit var edt_createemail : EditText
    lateinit var edt_createpass : EditText
    lateinit var edt_confirmpass : EditText

    lateinit var txt_response : TextView

    lateinit var Buttonsave : Button
    var Buttonback : Button ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_acc)

        Buttonsave = findViewById(R.id.btn_save)
        Buttonsave.setOnClickListener {
            val intent = Intent(this,Get_started::class.java)
            startActivity(intent)
        }

        Buttonback = findViewById(R.id.btn_createback)
        Buttonback!!.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        edt_createname = findViewById(R.id.edt_createname)
        edt_age = findViewById(R.id.edt_age)
        edt_phonenumber = findViewById(R.id.edt_phonenumber)
        edt_createemail = findViewById(R.id.edt_createemail)
        edt_createpass = findViewById(R.id.edt_createpass)
        edt_confirmpass = findViewById(R.id.edt_confirmpass)

        //if statement to deny access if fields are empty
        //if statement to solve unmatching password


    }
}