package com.example.beelineuzbekistan.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.beelineuzbekistan.R
import com.example.beelineuzbekistan.model.BeelineProductModel
import kotlinx.android.synthetic.main.product_beeline_layout.view.*

class ProductBeelineAdapter(val items:List<BeelineProductModel>):RecyclerView.Adapter<ProductBeelineAdapter.ItemHolder>() {
    inner class ItemHolder(view: View):RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(LayoutInflater.from(parent.context).inflate(R.layout.product_beeline_layout,parent,false))
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        var item = items[position]
        holder.itemView.tvTitleProduct.text = item.title
        holder.itemView.tvTitleAboutProduct.text = item.aboutTitle
        holder.itemView.btnBeelineProduct.text = item.title
        holder.itemView.recyclerBeelineProductItem.layoutManager = LinearLayoutManager(holder.itemView.context,LinearLayoutManager.HORIZONTAL,false)
        holder.itemView.recyclerBeelineProductItem.adapter = BeelineProductItemAdapter(item.productImg)
    }

    override fun getItemCount(): Int {
        return items.count()
    }

}