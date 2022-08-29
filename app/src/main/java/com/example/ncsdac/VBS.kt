package com.example.ncsdac

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class VBS : AppCompatActivity() {

    lateinit var Buttonvbs21 : Button
    lateinit var Buttonvbs22 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vbs)

        Buttonvbs21 = findViewById(R.id.btn_vbs2021)
        Buttonvbs21.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=67gLSG_meag&list=PLniVMplfrQTDzTqJmCis1dlBSgI0E3oDt"))
            startActivity(intent)
        }

        Buttonvbs22 = findViewById(R.id.btn_vbs2022)
        Buttonvbs22.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=a8WoQuVM33w&list=PLniVMplfrQTC4o_J3XggiW6MrNfdL-7mI"))
            startActivity(intent)
        }
    }
}