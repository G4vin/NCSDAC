package com.example.ncsdac

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    lateinit var Txtcreate : TextView
    lateinit var Txtlogin : TextView

    var Buttoncreate : Button ?= null
    var Buttonlogin : Button ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Txtcreate = findViewById(R.id.txt_create)
        Buttoncreate = findViewById(R.id.btn_create)
        Buttoncreate!!.setOnClickListener {
            val intent = Intent(this,Create_acc::class.java)
            startActivity(intent)
        }
        Txtlogin = findViewById(R.id.txt_login)
        Buttonlogin = findViewById(R.id.btn_login)
        Buttonlogin!!.setOnClickListener {
            val intent = Intent(this,Login::class.java)
            startActivity(intent)
        }
    }
}