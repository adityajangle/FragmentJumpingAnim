package com.example.fragmentjumpingonclick


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class FixFrag : Fragment() {
//val hostActivity=activity as MainActivity

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        /* rtVw.findViewById<Button>(R.id.btnScale).setOnClickListener {
            hostActivity.loadFrag(FragScale())
        }*/
        return inflater.inflate(R.layout.fragment_fix, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.btnScale).setOnClickListener {
            (activity as MainActivity).loadFrag(FragScale())
        }
        view.findViewById<Button>(R.id.btnRotate).setOnClickListener {
            (activity as MainActivity).loadFrag(FragRotate())
        }
        view.findViewById<Button>(R.id.btnFade).setOnClickListener {
            (activity as MainActivity).loadFrag(Fragfade())
        }

    }
}
