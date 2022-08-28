package com.geektech.lesson1_month6.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.geektech.lesson1_month6.framents.HistoryFragment

class PagerAdapter(fragment:FragmentActivity,private val list: List<Fragment>):FragmentStateAdapter(fragment)
{

    override fun getItemCount(): Int {
        return list.size
    }


    override fun createFragment(position: Int): Fragment {
       return   list[position]
    }
}