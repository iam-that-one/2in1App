package com.example.a2in1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.random.Random

class NumberGuessActivity : AppCompatActivity() {
    lateinit var add : Button
    lateinit var txt : EditText
    lateinit var lbl : TextView
    lateinit var  lbl1 : TextView
    lateinit var clear : Button
    var message = ""
    lateinit var tarace : ArrayList<String>
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number_guess)
        txt = findViewById(R.id.editTextTextPersonName3)
        tarace = ArrayList()
        add = findViewById(R.id.button2)
        lbl1 = findViewById(R.id.textView)
        clear = findViewById(R.id.button1)
        clear.alpha = 0F
        //  lbl = findViewById(R.id.textView6)

        val myRV = findViewById<RecyclerView>(R.id.rvMain)
        myRV.adapter = RecycleViewAddapter(tarace)
        myRV.layoutManager = LinearLayoutManager(this)
        var ans = ""
        var rand = 0

        lbl1.text = "Guess the correct number [***]"
        clear.setOnClickListener{
            lbl1.text = "Guess the correct number [***]"
            //  students =  mutableListOf("")
            tarace.add("----------------------------------------------------")
            clear.alpha = 0F
            tarace.clear()
            myRV.adapter?.notifyDataSetChanged()

        }
        add.setOnClickListener {

            ans = txt.text.toString()
            rand = Random.nextInt(11)
            if(ans == rand.toString()){
                lbl1.text = "Guess the correct number [Unlocked] [${ans}]"
                tarace.add("Your guess is ${ans}, You got it!! 😊")
                myRV.smoothScrollToPosition(tarace.size - 1)
                clear.alpha = 1F

            }else{

                tarace.add("Sorry!! ${ans} is Wrong guess 😐")
                myRV.smoothScrollToPosition(tarace.size - 1)
            }
            myRV.adapter?.notifyDataSetChanged()
            txt.text.clear()

        }
        println(tarace)
    }
}