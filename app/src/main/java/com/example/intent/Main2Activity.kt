package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {
    val id: Int = 10
    val language: String = "kotlin"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btnback.setOnClickListener() {
            intent = Intent(this, MainActivity::class.java)
            intent.putExtra("id value", id)
            intent.putExtra("language_value", language)
            startActivity(intent)
        }
    }
}
