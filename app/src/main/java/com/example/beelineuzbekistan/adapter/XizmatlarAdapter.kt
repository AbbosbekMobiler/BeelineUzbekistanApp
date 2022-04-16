package com.example.beelineuzbekistan.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.beelineuzbekistan.R
import com.example.beelineuzbekistan.model.XizmatlarModel
import kotlinx.android.synthetic.main.xizmatlar_item_layout.view.*

class XizmatlarAdapter(val items:List<XizmatlarModel>):RecyclerView.Adapter<XizmatlarAdapter.ItemHolder>() {
    inner class ItemHolder(view: View):RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(LayoutInflater.from(parent.context).inflate(R.layout.xizmatlar_item_layout,parent,false))
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        var item = items[position]
        holder.itemView.XizmatNomi.text = item.title
        holder.itemView.tvXizmatMuddati.text = item.muddati
        holder.itemView.tvXimatInternetPaket.text = item.trafik
        holder.itemView.tvXizmatNarxi.text = item.price
    }

    override fun getItemCount(): Int {
        return items.count()
    }
}