package com.startup.homians

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

class IntroPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro_page)


        val imageSlider = findViewById<ImageSlider>(R.id.imageSlider)
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel(R.drawable.intro1))
        imageList.add(SlideModel(R.drawable.intro2))
        imageList.add(SlideModel(R.drawable.intro3))

        imageSlider.setImageList(imageList, ScaleTypes.FIT)
    }

    fun login(view: View) {
        val intent = Intent(this, Login::class.java)
        startActivity(intent)
        finish()
    }
    fun signup(view: View) {
        val intent = Intent(this, SignUp::class.java)
        startActivity(intent)
        finish()
    }
}