package com.example.howemork9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.howemork9.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var res: Int = 0

        binding.btnPlus.setOnClickListener {
            res+= 1
            Toast.makeText(this, res.toString(), Toast.LENGTH_SHORT).show()
        }
        binding.btnMinus.setOnClickListener {
            if (res < 1)
                Toast.makeText(this, "Variable is less than 1", Toast.LENGTH_SHORT).show()
            else {
                res+= -1
                Toast.makeText(this, res.toString(), Toast.LENGTH_SHORT).show()
            }
        }
    }
}