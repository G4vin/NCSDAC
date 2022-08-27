package com.example.ncsdac

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Login : AppCompatActivity() {

    lateinit var edt_username : EditText
    lateinit var edt_email : EditText
    lateinit var edt_pass : EditText

    var Buttonnext : Button ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        edt_username = findViewById(R.id.edt_username)
        edt_email = findViewById(R.id.edt_email)
        edt_pass = findViewById(R.id.edt_pass)


        Buttonnext = findViewById(R.id.btn_next)
        Buttonnext!!.setOnClickListener {
            val intent = Intent(this,Get_started::class.java)
            startActivity(intent)
        }
        //If statement to deny access if fields are empty
        //Buttonnext!!.setOnClickListener {
          //  if (edt_username )
        //}
    }
}