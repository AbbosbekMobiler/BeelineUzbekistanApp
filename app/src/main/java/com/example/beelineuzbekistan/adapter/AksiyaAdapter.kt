package com.example.beelineuzbekistan.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.beelineuzbekistan.R
import com.example.beelineuzbekistan.model.AksiyaModel
import kotlinx.android.synthetic.main.aksiya_item_layout.view.*

class AksiyaAdapter(val items:List<AksiyaModel>):RecyclerView.Adapter<AksiyaAdapter.ItemHolder>() {
    inner class ItemHolder(view: View):RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(LayoutInflater.from(parent.context).inflate(R.layout.aksiya_item_layout,parent,false))
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        var item = items[position]
        holder.itemView.imgAk.setImageResource(item.img)
    }

    override fun getItemCount(): Int {
        return items.count()
    }
}