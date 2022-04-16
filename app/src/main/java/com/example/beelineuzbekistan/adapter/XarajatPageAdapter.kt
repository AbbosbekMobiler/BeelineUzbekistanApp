package com.example.beelineuzbekistan.adapter

import android.content.res.Resources
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.beelineuzbekistan.xarajatlar.BugunFragment
import com.example.beelineuzbekistan.xarajatlar.HaftaFragment
import com.example.beelineuzbekistan.xarajatlar.OyFragment
import com.example.beelineuzbekistan.xarajatlar.UchKunFragment

class XarajatPageAdapter(fragmentActivity: FragmentActivity):FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount() = 4

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0->{BugunFragment()}
            1->{UchKunFragment()}
            2->{HaftaFragment()}
            3->{OyFragment()}
            else ->{throw Resources.NotFoundException("Position not found")}
        }
    }
}