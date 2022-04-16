package com.example.beelineuzbekistan.narxlar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.beelineuzbekistan.R
import com.example.beelineuzbekistan.adapter.TariflarRecycler
import com.example.beelineuzbekistan.model.TariflarModel
import kotlinx.android.synthetic.main.fragment_tariflar.*

class TariflarFragment : Fragment() {
    val tarifList = listOf(
        TariflarModel("Hammasi zo'r 3","40 000 so'm/oy","∞","8 GB/oy","1 000/oy","40 000"),
        TariflarModel("Hammasi zo'r 1","20 000 so'm/oy","1 500 min/oy","3 GB/oy","500/oy","20 000"),
        TariflarModel("Hammasi zo'r 2","30 000 so'm/oy","2 500 min/oy","5 GB/oy","500/oy","30 000"),
        TariflarModel("Hammasi zo'r 4","60 000 so'm/oy","∞","15 GB/oy","1 000/oy","60 000"),
        TariflarModel("Status silver","95 000 so'm/oy","∞","30 GB/oy","2 000/oy","95 000"),
        TariflarModel("Status Gold","135 000 so'm/oy","∞","50 GB/oy","2 000/oy","135 000"),
        TariflarModel("Status Platinum","200 000 so'm/oy","∞","150 GB/oy","2 000/oy","200 000"),
        TariflarModel("oson 1","40 000 so'm/oy","∞","1 GB/oy","1 000/oy","40 000"),
        TariflarModel("kunlik","600 so'm/kun","60 min/kun","60 MB/kun","10","600 so'm"),
        TariflarModel("Bolajon","11 500 so'm/oy","500 min/oy","1 500 MB/oy","85 so'm","11 500 so'm"),
        TariflarModel("oson 10","10 000 so'm/oy","10 min/oy","10 MB/oy","10/oy","10 000 so'm"),
        TariflarModel("uydagidek","55 000 so'm/oy","2 000 min/oy","2 000 MB/oy","200/oy","55 000 so'm"),
    )
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tariflar, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerTarif.layoutManager = LinearLayoutManager(requireActivity())
        recyclerTarif.adapter = TariflarRecycler(tarifList)
    }
}