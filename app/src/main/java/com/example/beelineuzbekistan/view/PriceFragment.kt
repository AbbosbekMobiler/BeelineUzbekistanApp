package com.example.beelineuzbekistan.view

import android.content.res.Resources
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.beelineuzbekistan.R
import com.example.beelineuzbekistan.adapter.PricePageAdapter
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_price.*

class PriceFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_price, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewpagerPrice.adapter = PricePageAdapter(requireActivity())
        TabLayoutMediator(tabLayoutPrice,viewpagerPrice){tab,index->
            tab.text = when(index){
                0->{"Tariflar"}
                1->{"Xizmat"}
                2->{"Aksiya"}
                3->{"Yangilik"}
                else->{throw Resources.NotFoundException("position not found")}
            }
        }.attach()
    }

    companion object {
        @JvmStatic
        fun newInstance() = PriceFragment()
    }
}