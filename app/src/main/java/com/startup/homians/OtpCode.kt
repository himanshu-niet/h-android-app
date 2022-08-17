
package com.startup.homians

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class OtpCode : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp_code)
    }

    fun submit(view: View) {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
        finish()
    }
}