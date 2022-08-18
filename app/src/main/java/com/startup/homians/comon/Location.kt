package com.startup.homians.comon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.startup.homians.R

class Location : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_location)
    }

    fun location_btn(view: View) {
        val intent = Intent(this, Location::class.java)
        startActivity(intent)
    }
    fun search_btn(view: View) {
        val intent = Intent(this, Search::class.java)
        startActivity(intent)
    }
    fun cart_btn(view: View) {
        val intent = Intent(this, Cart::class.java)
        startActivity(intent)
    }
    fun notification_btn(view: View) {
        val intent = Intent(this, Notification::class.java)
        startActivity(intent)
    }
}