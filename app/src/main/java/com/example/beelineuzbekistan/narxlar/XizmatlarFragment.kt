package com.example.beelineuzbekistan.narxlar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.beelineuzbekistan.R
import com.example.beelineuzbekistan.adapter.XizmatlarAdapter
import com.example.beelineuzbekistan.model.XizmatlarModel
import kotlinx.android.synthetic.main.fragment_xizmatlar.*

class XizmatlarFragment : Fragment() {
    val xizmatList = listOf(
        XizmatlarModel("internet-paket 100 mb","2 000 so'm/kun","100 MB/kun","100 MB 1 kunga"),
        XizmatlarModel("internet-paket 200 mb","3 000 so'm/kun","200 MB/kun","200 MB 1 kunga"),
        XizmatlarModel("internet-paket 500 mb","5 000 so'm/kun","500 MB/kun","500 MB 1 kunga"),
        XizmatlarModel("internet-paket 4 GB","10 000 so'm/kun","4 GB/kun","4 GB 1 kunga"),
        XizmatlarModel("internet-paket 1.5 GB","10 000 so'm/7 kun","1.5 GB/7 kun","1.5 GB 7 kunga"),
        XizmatlarModel("internet-paket 2.5 GB","15 000 so'm/7 kun","2.5 GB/7 kun","2.5 GB 7 kunga"),
        XizmatlarModel("internet-paket 5 GB","20 000 so'm/7 kun","5 GB/7 kun","5 GB 1.7 kunga"),
        XizmatlarModel("internet-paket 75 GB","110 000 so'm/30 kun","75 GB/30 kun","75 GB 30 kunga"),
        XizmatlarModel("internet-paket 50 GB","90 000 so'm/30 kun","50 GB/30 kun","50 GB 30 kunga"),
        XizmatlarModel("internet-paket 30 GB","75 000 so'm/30 kun","30 GB/30 kun","30 GB 30 kunga"),
        XizmatlarModel("internet-paket 20 GB","65 000 so'm/30 kun","20 GB/30 kun","20 GB 30 kunga"),
        XizmatlarModel("internet-paket 10 GB","45 000 so'm/30 kun","10 GB/30 kun","10 GB 30 kunga"),
        XizmatlarModel("internet-paket 5 GB","25 000 so'm/30 kun","5 GB/30 kun","5 GB 30 kunga"),
        XizmatlarModel("internet-paket 2 GB","15 000 so'm/30 kun","2 GB/30 kun","2 GB 30 kunga"),
        XizmatlarModel("internet-paket 1 GB","10 000 so'm/30 kun","1 GB/30 kun","1 GB 30 kunga"),
    )
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_xizmatlar, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerXizmat.layoutManager = LinearLayoutManager(requireActivity())
        recyclerXizmat.adapter = XizmatlarAdapter(xizmatList)

    }

}