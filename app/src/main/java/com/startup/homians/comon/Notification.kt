package com.startup.homians.comon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.startup.homians.Adapter.KitchenRAdapter
import com.startup.homians.Adapter.NotificationRAdapter
import com.startup.homians.CategoryViewModal
import com.startup.homians.NotificationViewModal
import com.startup.homians.R
import com.startup.homians.databinding.FragmentHomeBinding
import com.startup.homians.databinding.NotificatonItemBinding

class Notification : AppCompatActivity() {
    lateinit var notList: List<NotificationViewModal>
    lateinit var notRecyclerView: RecyclerView
    lateinit var notRAdapter: NotificationRAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)

        notRecyclerView=findViewById(R.id.notification_recyclerView)


       notList = ArrayList<NotificationViewModal>()
        val desc="Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.";
        notList = notList + NotificationViewModal("C++","18/08/2022",desc)
        notList = notList + NotificationViewModal("Java", "18/08/2022",desc)
        notList = notList + NotificationViewModal("Android", "18/08/2022",desc)
        notList = notList + NotificationViewModal("Python", "18/08/2022",desc)
        notList = notList + NotificationViewModal("Javascript", "18/08/2022",desc)

        notRAdapter = NotificationRAdapter(notList)
        val klayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        notRecyclerView.layoutManager = klayoutManager
        notRecyclerView.adapter = notRAdapter
        notRAdapter.notifyDataSetChanged()


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