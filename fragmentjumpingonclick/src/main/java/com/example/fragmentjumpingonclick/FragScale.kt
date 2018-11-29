package com.example.fragmentjumpingonclick


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView

class FragScale : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rtVw=inflater.inflate(R.layout.fragment_frag_scale,container,false)
        return rtVw

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val anim:Animation=AnimationUtils.loadAnimation(activity,R.anim.scale)
        view.findViewById<ImageView>(R.id.imgVwScale).startAnimation(anim)
    }


}
