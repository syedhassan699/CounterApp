package com.example.counter

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tw = findViewById<TextView>(R.id.textview)
        val bt = findViewById<Button>(R.id.button)
        val rbt = findViewById<Button>(R.id.rbutton)
        var count =0
        bt.setOnClickListener {
            count += 1
            tw.text = count.toString()
        }
        rbt.setOnClickListener {
            count = 0
            tw.text = count.toString()
        }
    }
}