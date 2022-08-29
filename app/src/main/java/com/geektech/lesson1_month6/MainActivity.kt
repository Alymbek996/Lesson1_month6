package com.geektech.lesson1_month6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.geektech.lesson1_month6.Adapter.PagerAdapter
import com.geektech.lesson1_month6.databinding.ActivityMainBinding
import com.geektech.lesson1_month6.framents.FirstFragment
import com.geektech.lesson1_month6.framents.HistoryFragment
import com.geektech.lesson1_month6.framents.ResultFragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel
    private val fragmentList = listOf(FirstFragment(), ResultFragment(), HistoryFragment())
    private val fragmentTabs = listOf( "first","result","history")



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        val adapter=PagerAdapter(this,fragmentList)

        binding.viewPager.adapter=adapter
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab: TabLayout.Tab, i: Int ->
           tab.text = fragmentTabs[i]

        }.attach()
    }
 }