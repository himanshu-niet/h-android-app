package com.startup.homians.Adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.startup.homians.KitchenViewModal
import com.startup.homians.R

internal class KitchenRAdapter(private var kitList: List<KitchenViewModal>) :
    RecyclerView.Adapter<KitchenRAdapter.MyViewHolder>() {
    internal inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var kitName: TextView = view.findViewById(R.id.kit_name)
        var kitImg: LinearLayout = view.findViewById(R.id.kit_img)

    }
    @NonNull
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.kitchen_item, parent, false)
        return MyViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val kit = kitList[position]
        holder.kitName.text = kit.kitName
        holder.kitImg.setBackgroundResource(kit.kitImg)

    }
    override fun getItemCount(): Int {
        return kitList.size
    }
}