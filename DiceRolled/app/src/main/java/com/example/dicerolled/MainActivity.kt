package com.example.dicerolled

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_Button)
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice(){
        val randomInt = Random().nextInt(6)+1
        val resultTxt: TextView = findViewById(R.id.result_text)
        resultTxt.text = randomInt.toString()
    }
}
