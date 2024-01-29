package com.example.myapplication.Tuan7

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.R

class Tuan7MainActivity : AppCompatActivity() {
    var btn:Button? = null
    var tvKQ:TextView? = null
    var context: Context = this
    @SuppressLint("MissingInflatedID")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan7_main)
        btn = findViewById((R.id.tuan7))
        tvKQ = findViewById((R.id.Tuan7TVKQ))
        var fn = VolleyKotlinFn()
        btn!!.setOnClickListener {
        fn.getJSONArrayObjects(context, tvKQ!!)
    }
    }
}