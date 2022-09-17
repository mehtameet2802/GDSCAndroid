package com.example.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.diceapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    companion object {
        const val TAG = "Main Activity"
    }

    private lateinit var binding: ActivityMainBinding
    private var image: Int = R.drawable.dice_1
    private var value = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.dice.setImageResource(image)
        binding.btnRoll.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        value = (1..6).random()
        image = when (value) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.dice_3
        }
        binding.dice.setImageResource(image)
        Toast.makeText(this, "Selected value is $value ", Toast.LENGTH_SHORT).show()
        Log.w(TAG,"Successful completion")
        Log.d("Checking","Successful")
    }

}