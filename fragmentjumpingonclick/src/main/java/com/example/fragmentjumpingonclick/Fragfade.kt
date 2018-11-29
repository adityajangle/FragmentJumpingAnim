package com.example.fragmentjumpingonclick


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView

class Fragfade : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_fragfade, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val anim:Animation=AnimationUtils.loadAnimation(activity,R.anim.fade)
        view.findViewById<ImageView>(R.id.imgVwfade).startAnimation(anim)
        var flag=0
        if(flag!==0)
        {
            val anim:Animation=AnimationUtils.loadAnimation(activity,R.anim.fadeout)
            view.findViewById<ImageView>(R.id.imgVwfade).startAnimation(anim)
        }
    }

}
