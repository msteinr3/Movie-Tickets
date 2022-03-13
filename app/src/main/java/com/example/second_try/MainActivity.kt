package com.example.second_try

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.list)
        var array = arrayOf("Practice", "Maya", "Sahar", "Itamar")
        val adapter = ArrayAdapter(this, R.layout.listview_item, array)

        listView.adapter = adapter
        listView.setOnItemClickListener { parent, view, position, id ->

            if (position == 0) {
                val intent = Intent(this, Practice::class.java)
                startActivity(intent)
            }
            if (position == 1) {
                val intent = Intent(this, Maya::class.java)
                startActivity(intent)
            }
        }
    }
}
