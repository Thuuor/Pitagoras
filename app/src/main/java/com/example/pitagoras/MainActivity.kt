package com.example.pitagoras

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cateto1 = findViewById(R.id.editTextNumber) as EditText
        val cateto2 = findViewById(R.id.editTextNumber2) as EditText
        val button = findViewById(R.id.button) as Button
        val result = findViewById(R.id.textView4) as TextView

        button.setOnClickListener(){
           Pitagoras(cateto1,cateto2,result)
        }

    }

    fun Pitagoras(cateto1 : EditText,cateto2: EditText, result: TextView){
        val num1 = cateto1.text.toString().toDouble()
        val num2 = cateto2.text.toString().toDouble()

        val hipotenusa = Math.pow((Math.pow(num1, 2.0) + Math.pow(num2,2.0)), 0.5).toString()

        result.setText(hipotenusa)
    }
/**/
}