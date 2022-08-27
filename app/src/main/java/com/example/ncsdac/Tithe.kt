package com.example.ncsdac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Tithe : AppCompatActivity() {

    lateinit var Buttonmpesa : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tithe)

        Buttonmpesa = findViewById(R.id.btn_mpesa)
        Buttonmpesa.setOnClickListener {
            val simToolKitLaunchIntent =
                applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")

            simToolKitLaunchIntent?.let { startActivity(it) }
        }
    }
}