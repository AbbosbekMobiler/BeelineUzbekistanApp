package com.example.beelineuzbekistan.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.beelineuzbekistan.R

class BClubFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b_club, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() = BClubFragment()
    }
}