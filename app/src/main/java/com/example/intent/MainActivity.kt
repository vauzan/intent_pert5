package com.example.intent


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
        val id: Int = 10
        val language:String ="kotlin"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //button untk mengirim data ke activity yang ke dua
        btnclick.setOnClickListener() {
            intent = Intent(this, Main2Activity::class.java)
            intent.putExtra("id value", id)
            intent.putExtra("language_value", language)
            startActivity(intent)
        }
        fun startActivity(Main2Activity: MainActivity){
            Toast.makeText(this, "masuk ke halaman baru ",
                Toast.LENGTH_SHORT).show()
        }
    }
    }
