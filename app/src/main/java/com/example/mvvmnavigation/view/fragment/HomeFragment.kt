package com.example.mvvmnavigation.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.example.mvvmnavigation.R

class HomeFragment : Fragment() {

    lateinit var btn_go_to_search : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        Cast(view)

        return view
    }

    private fun Cast(view: View){

        btn_go_to_search = view.findViewById(R.id.btn_homeFragment_search)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_go_to_search.setOnClickListener {

            val navDirections = HomeFragmentDirections.actionHomeFragmentToSearchFragment()
            Navigation.findNavController(btn_go_to_search).navigate(navDirections)

        }

    }

}