package com.example.calculator

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val btnPlus: Button = findViewById(R.id.btn_plus)
        val btnMinus: Button = findViewById(R.id.btn_minus)
        val btnMulti: Button = findViewById(R.id.btn_multi)
        val btnDiv: Button = findViewById(R.id.btn_div)
        var btnNext: Button = findViewById(R.id.btn_next)
        binding.btnPlus.setOnClickListener {
            val text1: EditText = findViewById(R.id.number1)
            val text2: EditText = findViewById(R.id.number2)
            val num1: Int = text1.text.toString().toIntOrNull() ?: 0
            val num2: Int = text2.text.toString().toIntOrNull() ?: 0
            val result: Int = num1 + num2
            val resultView: TextView = findViewById(R.id.result)
            resultView.text =  result.toString()
        }
        binding.btnMinus.setOnClickListener {
            val text1: EditText = findViewById(R.id.number1)
            val text2: EditText = findViewById(R.id.number2)
            val num1: Int = text1.text.toString().toIntOrNull() ?: 0
            val num2: Int = text2.text.toString().toIntOrNull() ?: 0
            val result: Int = num1 - num2
            val resultView: TextView = findViewById(R.id.result)
            resultView.text = result.toString()
        }
        binding.btnMulti.setOnClickListener {
            val text1: EditText = findViewById(R.id.number1)
            val text2: EditText = findViewById(R.id.number2)
            val num1: Int = text1.text.toString().toIntOrNull() ?: 0
            val num2: Int = text2.text.toString().toIntOrNull() ?: 0
            val result: Int = num1 * num2
            val resultView: TextView = findViewById(R.id.result)
            resultView.text = result.toString()
        }
        binding.btnDiv.setOnClickListener {
            val text1: EditText = findViewById(R.id.number1)
            val text2: EditText = findViewById(R.id.number2)
            val num1: Int = text1.text.toString().toIntOrNull() ?: 0
            val num2: Int = text2.text.toString().toIntOrNull() ?: 0
            val num1float = num1.toFloat()
            val num2float = num2.toFloat()
            val result: Float = num1float / num2float
            val resultView: TextView = findViewById(R.id.result)
            resultView.text =  result.toString()
        }
        binding.btnNext.setOnClickListener {
            var intent:Intent = Intent(this,Manhinh2::class.java)
            startActivity(intent)
        }

    }
}