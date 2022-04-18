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
import kotlinx.android.synthetic.main.fragment_yangiliklar.*

class YangiliklarFragment : Fragment() {

    val yanList = listOf(
        AksiyaModel(R.drawable.yan1),
        AksiyaModel(R.drawable.yan2),
        AksiyaModel(R.drawable.yan3),
        AksiyaModel(R.drawable.yan4),
        AksiyaModel(R.drawable.yan5),
        AksiyaModel(R.drawable.yan6),
        AksiyaModel(R.drawable.yan7),
        AksiyaModel(R.drawable.yan8),
        AksiyaModel(R.drawable.yan9)
    )
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_yangiliklar, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerYangilik.layoutManager = LinearLayoutManager(requireActivity())
        recyclerYangilik.adapter = AksiyaAdapter(yanList)
    }
}