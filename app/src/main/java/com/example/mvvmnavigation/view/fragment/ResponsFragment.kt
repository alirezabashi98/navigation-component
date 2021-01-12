package com.example.mvvmnavigation.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.mvvmnavigation.R


class ResponsFragment : Fragment() {

    lateinit var txt: TextView

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_respons, container, false)

        Cast(view)

        return view
    }

    private fun Cast(view: View) {
        txt = view.findViewById(R.id.textView_ResponsFragment_Respons)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val data: String? = arguments?.getString("data")

        if (data?.length ?: 0 >= 1)
            txt.text = data
        else
            txt.text = "Null"

    }

}