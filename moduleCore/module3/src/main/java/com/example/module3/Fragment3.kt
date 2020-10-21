package com.example.module3

import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.base.BaseFragment
import kotlinx.android.synthetic.main.frag.*

/**
 *author: zcs
 *date  : 2020/10/20
 *
 **/
class Fragment3 : BaseFragment(R.layout.frag){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tv_text.text="3333"
        Log.e("mll","3333")

//        tv_text.findNavController().navigate(R.id.framnt1)
    }
}