package com.startup.homians

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast
import com.startup.homians.Adapter.CategoryGridAdapter
import com.startup.homians.Adapter.KitchenGridAdapter

class All_Category : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_category)

        lateinit var categoryGrid: GridView
        lateinit var categoryList: List<CategoryViewModal>

        // initializing variables of grid view with their ids.
        categoryGrid = findViewById(R.id.category_grid)
        categoryList = ArrayList<CategoryViewModal>()

        // on below line we are adding data to
        // our course list with image and course name.
        categoryList = categoryList + CategoryViewModal("C++", R.drawable.ask)
        categoryList = categoryList + CategoryViewModal("Java", R.drawable.ask)
        categoryList = categoryList + CategoryViewModal("Android", R.drawable.ask)
        categoryList = categoryList + CategoryViewModal("Python", R.drawable.kit)
        categoryList = categoryList + CategoryViewModal("Javascript", R.drawable.kit)

        // on below line we are initializing our course adapter
        // and passing course list and context.
        val courseAdapter = CategoryGridAdapter(categoryList = categoryList, this@All_Category)

        // on below line we are setting adapter to our grid view.
        categoryGrid.adapter = courseAdapter

        // on below line we are adding on item
        // click listener for our grid view.
        categoryGrid.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            // inside on click method we are simply displaying
            // a toast message with course name.
            Toast.makeText(
                applicationContext, categoryList[position].catName + " selected",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}