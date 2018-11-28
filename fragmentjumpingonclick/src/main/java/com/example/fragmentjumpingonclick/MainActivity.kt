package com.example.fragmentjumpingonclick

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadFrag(FragRotate())
    }
    fun loadFrag(frag:Fragment)
    {
        val txn=supportFragmentManager.beginTransaction()
        txn.replace(R.id.frameLayout,frag)
        txn.commit()
    }
}
