package com.example.beelineuzbekistan.view

import android.content.res.Resources
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.beelineuzbekistan.R
import com.example.beelineuzbekistan.adapter.XarajatPageAdapter
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_expense.*

class ExpenseFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_expense, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewpagerXarajat.adapter = XarajatPageAdapter(requireActivity())
        TabLayoutMediator(tabLayoutXarajat,viewpagerXarajat){tab,index->
            tab.text = when(index){
                0 -> {"BUGUNGI KUNDA "}
                1 -> {"3 KUN "}
                2 -> {"BIR HAFTA ICHIDA "}
                3 -> {"BIR OY DAVOMIDA"}
                else->{throw Resources.NotFoundException("Position not found")}
            }
        }.attach()
    }

    companion object {
        @JvmStatic
        fun newInstance() = ExpenseFragment()
    }
}