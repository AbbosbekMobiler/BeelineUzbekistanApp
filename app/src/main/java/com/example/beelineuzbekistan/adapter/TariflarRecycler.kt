package com.example.beelineuzbekistan.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.beelineuzbekistan.R
import com.example.beelineuzbekistan.model.TariflarModel
import kotlinx.android.synthetic.main.tariflar_item_layout.view.*

class TariflarRecycler(val items:List<TariflarModel>):RecyclerView.Adapter<TariflarRecycler.ItemHolder>() {
    inner class ItemHolder(view: View):RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(LayoutInflater.from(parent.context).inflate(R.layout.tariflar_item_layout,parent,false))
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        var item = items[position]
        holder.itemView.tvTarifDaqiqasi.text = item.daqiqalar
        holder.itemView.tvTarifInternetPaket.text = item.oylikMb
        holder.itemView.tvTarifSMSPaket.text = item.oylikSms
        holder.itemView.tvTarifNarxi.text = item.price
        holder.itemView.TarifNarxiAsosiy.text = item.oylikNarx
        holder.itemView.TarifNomi.text = item.title
    }

    override fun getItemCount(): Int {
        return items.count()
    }
}