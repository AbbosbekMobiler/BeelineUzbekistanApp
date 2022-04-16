package com.example.beelineuzbekistan.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.beelineuzbekistan.R
import com.example.beelineuzbekistan.model.BeelineProductModel
import com.example.beelineuzbekistan.model.ProductImage
import kotlinx.android.synthetic.main.beeline_product_image.view.*

class BeelineProductItemAdapter(val items:List<ProductImage>):RecyclerView.Adapter<BeelineProductItemAdapter.ItemHolder>() {
    inner class ItemHolder(view: View):RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(LayoutInflater.from(parent.context).inflate(R.layout.beeline_product_image,parent,false))
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        var item = items[position]
        holder.itemView.beelineProductImage.setImageResource(item.img)
    }

    override fun getItemCount(): Int {
        return items.count()
    }
}