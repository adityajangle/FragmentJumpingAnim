package com.example.fragmentjumpingonclick


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
class FragScale : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rtVw=inflater.inflate(R.layout.fragment_frag_scale,container,false)
        return rtVw

    }


}
