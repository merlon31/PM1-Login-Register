package com.example.mmobile

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Home2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2)

        val btn1 = findViewById<Button>(R.id.btnDial)
        btn1.setOnClickListener(View.OnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:081356012900"))
            startActivity(intent)
        })
    }
}