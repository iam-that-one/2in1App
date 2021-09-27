package com.example.a2in1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    lateinit var goToNumbersGame : Button
    lateinit var goToPhraseGame : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        goToNumbersGame = findViewById(R.id.button3)
        goToPhraseGame = findViewById(R.id.button4)
        goToNumbersGame.setOnClickListener{
            var intent = Intent(this,NumberGuessActivity::class.java)
            startActivity(intent)

        }

    }
}