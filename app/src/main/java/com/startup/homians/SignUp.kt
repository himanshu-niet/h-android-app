package com.startup.homians

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
    }

    fun signupbtn(view: View) {
        val intent = Intent(this, VerifyPhone::class.java)
        startActivity(intent)
        finish()
    }

    fun loginbtn(view: View) {
        val intent = Intent(this, Login::class.java)
        startActivity(intent)
        finish()
    }
}