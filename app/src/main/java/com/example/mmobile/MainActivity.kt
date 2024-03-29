package com.example.mmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener(View.OnClickListener {startActivity(Intent(this, Home2::class.java)) })
        textRegister.setOnClickListener(View.OnClickListener {startActivity(Intent(this, Register::class.java)) })
    }
}