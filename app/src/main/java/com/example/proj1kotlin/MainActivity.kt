package com.example.proj1kotlin

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
//    lateinit var text1view:TextView
//    lateinit var left_button:Button
//    lateinit var right_button:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
//        text1view=findViewById<TextView>(R.id.text1)
//        left_button=findViewById<Button>(R.id.leftButton)
//        right_button=findViewById<Button>(R.id.rightButton)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


//        left_button.setOnClickListener{
//            leftButtonClicked()
//        }
//
//        right_button.setOnClickListener{
//            rightButtonClicked()
//        }



    }
//    fun rightButtonClicked(){
//        text1view.text="Right Button Clicked"
//        right_button.text="Clicked"
//        right_button.setBackgroundColor(R.color.white)
//        right_button.setTextColor(R.color.black)
//        left_button.text="Left"
//        left_button.setBackgroundColor(R.color.black)
//        left_button.setTextColor(R.color.white)
//    }
//    fun leftButtonClicked(){
//        text1view.text="Left Button Clicked"
//        right_button.text="Right"
//        right_button.setBackgroundColor(R.color.black)
//        right_button.setTextColor(R.color.white)
//        left_button.setBackgroundColor(R.color.white)
//        left_button.setTextColor(R.color.black)
//        left_button.text="Clicked"
//    }

}