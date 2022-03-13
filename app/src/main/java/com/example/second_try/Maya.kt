package com.example.second_try

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Maya : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maya)

        val actionbar = supportActionBar
        actionbar!!.title = "Maya"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}