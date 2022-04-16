package com.example.beelineuzbekistan.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.beelineuzbekistan.R
import com.example.beelineuzbekistan.adapter.ProductBeelineAdapter
import com.example.beelineuzbekistan.adapter.StoryAdapter
import com.example.beelineuzbekistan.model.BeelineProductModel
import com.example.beelineuzbekistan.model.ProductImage
import com.example.beelineuzbekistan.model.StoryModel
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {
    val storyList = listOf(
        StoryModel(R.drawable.paketlar,"Paketlar"),
        StoryModel(R.drawable.bepul,"Bepul"),
        StoryModel(R.drawable.media,"Media"),
        StoryModel(R.drawable.dokon,"Do'kon"),
        StoryModel(R.drawable.visa,"Visa"),
        StoryModel(R.drawable.tariflar,"Ta'riflar"),
        StoryModel(R.drawable.bigdata,"Big Data")
    )
    val beelineProductList = listOf(
        BeelineProductModel("Beeline TV","65 dan ortiq telekanallar,filmlar va seriallarni" +
                " internet trafik sarflamagan holda tomosha qiling", listOf(
            ProductImage(R.drawable.umar_ibn_xattob),
            ProductImage(R.drawable.parizod),
            ProductImage(R.drawable.otasining),
            ProductImage(R.drawable.sensiz),
            ProductImage(R.drawable.hafabolish),
            ProductImage(R.drawable.afsus)
        )),
        BeelineProductModel("Beeline Music","Internet trafikni sarflamagan holda millionlab" +
                " qo'shiqlar va mashhur radiostansiyalarni tinglang", listOf(
            ProductImage(R.drawable.music1),
            ProductImage(R.drawable.music2),
            ProductImage(R.drawable.music3),
            ProductImage(R.drawable.music4),
            ProductImage(R.drawable.music5),
            ProductImage(R.drawable.music6)
        )),
        BeelineProductModel("Beepul","Beepul orqali to'lovlar amalga oshiring va" +
                " har bir to'lov uchun bonuslarga ega bo'ling", listOf(
            ProductImage(R.drawable.beepul1),
            ProductImage(R.drawable.beepul2),
            ProductImage(R.drawable.beepul3),
            ProductImage(R.drawable.beepul4),
            ProductImage(R.drawable.beepul5),
            ProductImage(R.drawable.beepul6)
        )),
        BeelineProductModel("Beeline Pressa","Dunyodagi eng so'nggi yangiliklarni va " +
                " eng so'nggi jurnallarni o'qing", listOf(
            ProductImage(R.drawable.pressa1),
            ProductImage(R.drawable.pressa2),
            ProductImage(R.drawable.pressa3),
            ProductImage(R.drawable.pressa5),
            ProductImage(R.drawable.pressa6)
        )),
        BeelineProductModel("Beeline App","1 000 dan ortiq o'yinlar, 400 dan ortiq " +
                "ilovalar bularning barchasi reklamasiz va internet trafikni sarflamagan holda", listOf(
            ProductImage(R.drawable.app1),
            ProductImage(R.drawable.app2),
            ProductImage(R.drawable.app3),
            ProductImage(R.drawable.app4),
            ProductImage(R.drawable.app5),
            ProductImage(R.drawable.app6)
        )),
        BeelineProductModel("Fantasy Football","Haqiqiy futbolchilardan tashkil topgan" +
                "<<FANTASTIK JAMOINGIZNI>> yarating", listOf(
            ProductImage(R.drawable.football1),
            ProductImage(R.drawable.football2),
            ProductImage(R.drawable.football3),
            ProductImage(R.drawable.football4),
            ProductImage(R.drawable.football5),
            ProductImage(R.drawable.football6)
        )),
        BeelineProductModel("Bookmate Kitoblar","14 tildan iborat bo'lgan 1 000 000 " +
                "dan ortiq kitoblarni o'qing", listOf(
            ProductImage(R.drawable.book1),
            ProductImage(R.drawable.book2),
            ProductImage(R.drawable.book3),
            ProductImage(R.drawable.book4),
            ProductImage(R.drawable.book5),
            ProductImage(R.drawable.book6)
        )),
    )
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerStory.layoutManager = LinearLayoutManager(requireActivity(),LinearLayoutManager.HORIZONTAL,false)
        recyclerStory.adapter = StoryAdapter(storyList)

        recyclerBeelineProduct.layoutManager = LinearLayoutManager(requireActivity())
        recyclerBeelineProduct.adapter = ProductBeelineAdapter(beelineProductList)
    }

    companion object {
        @JvmStatic
        fun newInstance() = HomeFragment()
    }
}