package com.example.ncsdac

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ChildrenMinistry : AppCompatActivity() {

    lateinit var Buttoncmweb : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_children_ministry)

        Buttoncmweb = findViewById(R.id.btn_cmweb)
        Buttoncmweb.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://children.adventist.org/"))
            startActivity(intent)
        }
    }
}