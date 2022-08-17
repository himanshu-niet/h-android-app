package com.startup.homians

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class VerifyPhone : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify_phone)
    }

    fun signup(view: View) {
        val intent = Intent(this, OtpCode::class.java)
        startActivity(intent)
        finish()
    }
}