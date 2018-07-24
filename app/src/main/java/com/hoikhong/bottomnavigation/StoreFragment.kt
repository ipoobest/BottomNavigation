package com.hoikhong.bottomnavigation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class StoreFragment : Fragment() {

    companion object {
        fun newInstance() : StoreFragment{
            val fragment = StoreFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bundle = arguments
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_store,container,false)
        bindView(rootView)
        return rootView
    }

    private fun bindView(rootView: View?) {

    }
}