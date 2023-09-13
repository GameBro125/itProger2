package com.example.itproger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ItemActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item)
            val title: TextView = findViewById(R.id.itemListTitle1)
            val text: TextView = findViewById(R.id.itemListText)

            title.text = intent.getStringExtra("itemTitle")
            text.text = intent.getStringExtra("itemText")
        }
}