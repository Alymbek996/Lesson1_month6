package com.geektech.lesson1_month6.framents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.geektech.lesson1_month6.MainViewModel
import com.geektech.lesson1_month6.R
import com.geektech.lesson1_month6.databinding.FragmentHistoryBinding


class HistoryFragment : Fragment() {
private lateinit var binding: FragmentHistoryBinding
private lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel= ViewModelProvider(requireActivity())[MainViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentHistoryBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.history.observe(viewLifecycleOwner){
            binding.tvhis.text= it
        }
    }

}