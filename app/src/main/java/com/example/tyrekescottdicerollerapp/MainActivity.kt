package com.example.tyrekescottdicerollerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val diceRoller: Button = findViewById(R.id.diceRoller)
        diceRoller.setOnClickListener {
            rollingDice1()
            //rollingDice2()
        }
    }

        private fun rollingDice1() {
            val diceIn1 = Dice(6)
            val diceRoll1 = diceIn1.roll()
            val dice1: Int =  diceRoll1
            //val resultTextView: TextView = findViewById(R.id.diceResult1)
            //resultTextView.text = diceRoll1.toString()

            val diceSide1: ImageView = findViewById(R.id.dice_side1)

            val drawableResource1 = when (diceRoll1) {
                1 -> R.drawable.dice_six_faces_one
                2 -> R.drawable.dice_six_faces_two
                3 -> R.drawable.dice_six_faces_three
                4 -> R.drawable.dice_six_faces_four
                5 -> R.drawable.dice_six_faces_five
                else -> R.drawable.dice_six_faces_six
            }
            diceSide1.setImageResource(drawableResource1)

            val diceIn2 = Dice(6)
            val diceRoll2 = diceIn2.roll()
            val dice2: Int =  diceRoll2
            //val resultTextView: TextView = findViewById(R.id.diceResult2)
            //resultTextView.text = diceRoll2.toString()

            val diceSide2: ImageView = findViewById(R.id.dice_side2)

            val drawableResource2 = when (diceRoll2) {
                1 -> R.drawable.dice_six_faces_one
                2 -> R.drawable.dice_six_faces_two
                3 -> R.drawable.dice_six_faces_three
                4 -> R.drawable.dice_six_faces_four
                5 -> R.drawable.dice_six_faces_five
                else -> R.drawable.dice_six_faces_six
            }
            diceSide2.setImageResource(drawableResource2)

            val sum = dice2 + dice1
            val resultTextView: TextView = findViewById(R.id.diceResult)
            resultTextView.text = sum.toString()
        }





}

class Dice(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}


