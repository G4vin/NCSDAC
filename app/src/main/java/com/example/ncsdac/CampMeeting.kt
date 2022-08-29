package com.example.ncsdac

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CampMeeting : AppCompatActivity() {

    lateinit var Buttoncamp20 : Button
    lateinit var Buttoncamp21 : Button
    lateinit var Buttoncamp22 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camp_meeting)

        Buttoncamp20 = findViewById(R.id.btn_camp2020)
        Buttoncamp20.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=5BfEfn6EJOA&list=PLniVMplfrQTB6m2oliMxdvsIBs05Fug58"))
            startActivity(intent)
        }

        Buttoncamp21 = findViewById(R.id.btn_camp2021)
        Buttoncamp21.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=hxVPLVn3tV4&list=PLniVMplfrQTD-cHMATcSTSWzKe2BOv-Fx"))
            startActivity(intent)
        }

        Buttoncamp22 = findViewById(R.id.btn_camp2022)
        Buttoncamp22.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=hhR-V6LeSkY&list=PLniVMplfrQTBQtxqyTO-v_LVjxxM47d5f"))
            startActivity(intent)
        }
    }
}