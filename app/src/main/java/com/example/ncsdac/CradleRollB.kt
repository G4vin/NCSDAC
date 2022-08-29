package com.example.ncsdac

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CradleRollB : AppCompatActivity() {

    lateinit var Buttoncradlesson : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cradle_roll_b)

        Buttoncradlesson = findViewById(R.id.btn_cradlesson)
        Buttoncradlesson.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gracelink.net/beginner"))
            startActivity(intent)
        }
    }
}