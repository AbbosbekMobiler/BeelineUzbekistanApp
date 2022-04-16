package com.example.beelineuzbekistan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.beelineuzbekistan.view.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val homeFragment = HomeFragment.newInstance()
    val expenseFragment = ExpenseFragment.newInstance()
    val priceFragment = PriceFragment.newInstance()
    val bClubFragment = BClubFragment.newInstance()
    val helpFragment = HelpFragment.newInstance()
    var activFragment : Fragment = homeFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.flContainer,homeFragment,homeFragment.tag).hide(homeFragment).commit()
        supportFragmentManager.beginTransaction().add(R.id.flContainer,expenseFragment,expenseFragment.tag).hide(expenseFragment).commit()
        supportFragmentManager.beginTransaction().add(R.id.flContainer,priceFragment,priceFragment.tag).hide(priceFragment).commit()
        supportFragmentManager.beginTransaction().add(R.id.flContainer,bClubFragment,bClubFragment.tag).hide(bClubFragment).commit()
        supportFragmentManager.beginTransaction().add(R.id.flContainer,helpFragment,helpFragment.tag).hide(helpFragment).commit()

        supportFragmentManager.beginTransaction().show(activFragment).commit()

        bottom_navigation_view.setOnItemSelectedListener {
            if (it.itemId == R.id.ActionHome){
                supportFragmentManager.beginTransaction().hide(activFragment).show(homeFragment).commit()
                activFragment = homeFragment
            }else if (it.itemId == R.id.ActionExpense){
                supportFragmentManager.beginTransaction().hide(activFragment).show(expenseFragment).commit()
                activFragment = expenseFragment
            }else if (it.itemId == R.id.ActionPrice){
                supportFragmentManager.beginTransaction().hide(activFragment).show(priceFragment).commit()
                activFragment = priceFragment
            }else if (it.itemId == R.id.ActionClub){
                supportFragmentManager.beginTransaction().hide(activFragment).show(bClubFragment).commit()
                activFragment = bClubFragment
            }else if (it.itemId == R.id.ActionHelp){
                supportFragmentManager.beginTransaction().hide(activFragment).show(helpFragment).commit()
                activFragment = helpFragment
            }
            true
        }
    }
}