package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class calculatorActivity : AppCompatActivity() {
    lateinit var etnumber1:EditText
    lateinit var etnumber2:EditText
    lateinit var btnAdd:Button
    lateinit var btnminus:Button
    lateinit var btnMultiply:Button
    lateinit var btnmoduls:Button
    lateinit var tvresults:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        etnumber1=findViewById(R.id.etnumber1)
        etnumber2=findViewById(R.id.etnumber2)
        btnAdd=findViewById(R.id.btnAdd)
        btnminus=findViewById(R.id.btnminus)
        btnMultiply=findViewById(R.id.btnMultiply)
        btnmoduls=findViewById(R.id.btnmodulus)
        tvresults=findViewById(R.id.tvresults)

        btnAdd.setOnClickListener {
            val number1=etnumber1.text.toString().toDouble()
            val number2=etnumber2.text.toString().toDouble()
            add(number1,number2)
        }
        btnminus.setOnClickListener {
            val number1=etnumber1.text.toString().toDouble()
            val number2=etnumber2.text.toString().toDouble()
            subtract(number1,number2)
        }
        btnMultiply.setOnClickListener {
            val number1=etnumber1.text.toString().toDouble()
            val number2=etnumber2.text.toString().toDouble()
            product(number1,number2)
        }
        btnmoduls.setOnClickListener {
            val number1=etnumber1.text.toString().toDouble()
            val number2=etnumber2.text.toString().toDouble()
            remainder(number1,number2)
        }
    }
    fun add(number1:Double,number2:Double){
        val add=number1+number2
        tvresults.text=add.toString()
    }
    fun subtract(number1:Double,number2:Double){
        val subtract=number1-number2
        tvresults.text=subtract.toString()
    }
    fun product(number1:Double,number2:Double){
        val product=number1*number2
        tvresults.text=product.toString()
    }
    fun remainder(number1:Double,number2:Double){
        val remainder=number1%number2
        tvresults.text=remainder.toString()
    }

}