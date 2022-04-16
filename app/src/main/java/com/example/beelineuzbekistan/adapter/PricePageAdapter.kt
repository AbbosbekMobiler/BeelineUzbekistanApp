package com.example.beelineuzbekistan.adapter

import android.content.res.Resources
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.beelineuzbekistan.narxlar.AksiyalarFragment
import com.example.beelineuzbekistan.narxlar.TariflarFragment
import com.example.beelineuzbekistan.narxlar.XizmatlarFragment
import com.example.beelineuzbekistan.narxlar.YangiliklarFragment

class PricePageAdapter(fragmentActivity: FragmentActivity):FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0->{TariflarFragment()}
            1->{XizmatlarFragment()}
            2->{AksiyalarFragment()}
            3->{YangiliklarFragment()}
            else->{throw Resources.NotFoundException("position not found")}
        }
    }
}