package com.example.ncsdac

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Contact : AppCompatActivity() {

    lateinit var Buttonsms : Button
    lateinit var Buttonemail : Button
    lateinit var Buttondial : Button

    var Buttonback : Button ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        Buttonsms = findViewById(R.id.btn_sms)
        Buttonsms.setOnClickListener {
            val uri = Uri.parse("smsto: 0700370309")

            val intent = Intent(Intent.ACTION_SENDTO, uri)

            intent.putExtra("sms_body", "Greetings.")
            startActivity(intent)
        }

        Buttonemail = findViewById(R.id.btn_email)
        Buttonemail.setOnClickListener {
            val emailIntent =
                Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","gavinochira@gmail.com",null))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT,"Subject")
            emailIntent.putExtra(Intent.EXTRA_TEXT,"Body")
            startActivity(Intent.createChooser(emailIntent,"Send email..."))
        }

        Buttondial = findViewById(R.id.btn_dial)
        Buttondial.setOnClickListener {
            val phone = "+0202721461"

            val intent = Intent(Intent.ACTION_DIAL,Uri.fromParts("tel", phone, null))
            startActivity(intent)
        }

        Buttonback = findViewById(R.id.btn_contactback)
        Buttonback!!.setOnClickListener {
            val intent = Intent(this,Get_started::class.java)
            startActivity(intent)
        }
    }
}