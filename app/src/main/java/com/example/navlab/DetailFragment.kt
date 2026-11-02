package com.example.navlab

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.util.Log
import androidx.fragment.app.Fragment

class DetailFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("LC_Detail", "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("LC_Detail", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("LC_Detail", "onCreateView")

        return inflater.inflate(
            R.layout.fragment_detail,
            container,
            false
        )
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("LC_Detail", "onViewCreated")

        val itemId = arguments?.getInt("itemId")

        val tvDetail = view.findViewById<TextView>(R.id.tvDetail)

        tvDetail.text = "Item ID: $itemId"
    }

    override fun onStart() {
        super.onStart()
        Log.d("LC_Detail", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LC_Detail", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LC_Detail", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LC_Detail", "onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("LC_Detail", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LC_Detail", "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("LC_Detail", "onDetach")
    }
}