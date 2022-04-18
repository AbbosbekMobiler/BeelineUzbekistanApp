package com.example.beelineuzbekistan.narxlar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.beelineuzbekistan.R
import com.example.beelineuzbekistan.adapter.AksiyaAdapter
import com.example.beelineuzbekistan.model.AksiyaModel
import kotlinx.android.synthetic.main.fragment_aksiyalar.*

class AksiyalarFragment : Fragment() {
    val akList = listOf(
        AksiyaModel(R.drawable.ak1),
        AksiyaModel(R.drawable.ak2),
        AksiyaModel(R.drawable.ak3),
        AksiyaModel(R.drawable.ak4),
        AksiyaModel(R.drawable.ak5),
        AksiyaModel(R.drawable.ak6)
    )
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_aksiyalar, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerAksiya.layoutManager = LinearLayoutManager(requireActivity())
        recyclerAksiya.adapter = AksiyaAdapter(akList)
    }

}