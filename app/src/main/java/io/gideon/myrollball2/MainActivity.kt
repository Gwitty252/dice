package io.gideon.myrollball2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.LinearLayoutCompat
import java.util.Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val linear1 = findViewById<LinearLayoutCompat>(R.id.linearLayoutCompat)
        val dice1 = findViewById<ImageView>(R.id.imageView1)
        val dice2 = findViewById<ImageView>(R.id.imageView2)
        val num1 = findViewById<TextView>(R.id.number1)
        val plus = findViewById<TextView>(R.id.add)
        val num2 = findViewById<TextView>(R.id.number2)
        val results = findViewById<TextView>(R.id.result)
        val myroll = findViewById<Button>(R.id.rolldic)

        var array = arrayOf(
            R.drawable.dice_1,
            R.drawable.dice_2,
            R.drawable.dice_3,
            R.drawable.dice_4,
            R.drawable.dice_5,
            R.drawable.dice_6
        )

        fun roll(x: Button) {
            val rnd = Random()
            val rnd2 = Random()
            val position1 = rnd.nextInt(array.size)
            val position2 = rnd2.nextInt(array.size)

            var firstdie1 = dice1
            var secondDie = dice2
            val dieSelected1 = array[position1]
            val dieSelected2 = array[position2]

            var number1 = num1
            var number2 = num2
            var result = results

            firstdie1?.setImageResource(dieSelected1)
            secondDie?.setImageResource(dieSelected2)

            //Toast.makeText(this, "rolling", Toast.LENGTH_SHORT).show()


            when (dieSelected1) {
                array[0] -> {
                    num1.text = "1"
                }
                array[1] -> {
                    num1.text = "2"
                }
                array[2] -> {
                    num1.text = "3"
                }
                array[3] -> {
                    num1.text = "4"
                }
                array[4] -> {
                    num1.text = "5"
                }
                array[5] -> {
                    num1.text = "6"
                }

            }

            when (dieSelected2) {
                array[0] -> {
                    num2.text = "1"
                }
                array[1] -> {
                    num2.text = "2"
                }
                array[3] -> {
                    num2.text = "3"
                }
                array[4] -> {
                    num2.text = "5"
                }
                array[5] -> {
                    num2.text = "6"
                }

                else -> R.drawable.dice_6

            }

            val weAdd = num1.text.toString().toInt() + num2.text.toString().toInt()
            results.text= weAdd.toString()



        }
        myroll.setOnClickListener {
            roll(myroll)
        }


    }
}

