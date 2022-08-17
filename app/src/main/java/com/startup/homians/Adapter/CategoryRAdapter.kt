package com.startup.homians.Adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.startup.homians.CategoryViewModal
import com.startup.homians.KitchenViewModal
import com.startup.homians.R

internal class CategoryRAdapter(private var catList: List<CategoryViewModal>) :
    RecyclerView.Adapter<CategoryRAdapter.MyViewHolder>() {
    internal inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var catName: TextView = view.findViewById(R.id.category_name)
        var catImg: LinearLayout = view.findViewById(R.id.category_image)

    }
    @NonNull
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.category_item, parent, false)
        return MyViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val cat = catList[position]
        holder.catName.text = cat.catName
        holder.catImg.setBackgroundResource(cat.catImg)

    }
    override fun getItemCount(): Int {
        return catList.size
    }
}