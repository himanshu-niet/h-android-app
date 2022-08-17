package com.startup.homians

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast
import com.startup.homians.Adapter.KitchenGridAdapter

class All_Kitchen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_kitchen)
        lateinit var kitgrid: GridView
            lateinit var kitList: List<KitchenViewModal>

                // initializing variables of grid view with their ids.
        kitgrid = findViewById(R.id.idGRV)
                kitList = ArrayList<KitchenViewModal>()

                // on below line we are adding data to
                // our course list with image and course name.
                kitList = kitList + KitchenViewModal("C++", R.drawable.kit)
                kitList = kitList + KitchenViewModal("Java", R.drawable.kit)
                kitList = kitList + KitchenViewModal("Android", R.drawable.kit)
                kitList = kitList + KitchenViewModal("Python", R.drawable.kit)
                kitList = kitList + KitchenViewModal("Javascript", R.drawable.kit)

                // on below line we are initializing our course adapter
                // and passing course list and context.
                val courseAdapter = KitchenGridAdapter(kitList = kitList, this@All_Kitchen)

                // on below line we are setting adapter to our grid view.
        kitgrid.adapter = courseAdapter

                // on below line we are adding on item
                // click listener for our grid view.
        kitgrid.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
                    // inside on click method we are simply displaying
                    // a toast message with course name.
                    Toast.makeText(
                        applicationContext, kitList[position].kitName + " selected",
                        Toast.LENGTH_SHORT
                    ).show()
                }



    }
}