package com.example.module1

import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.base.BaseFragment

/**
 *author: zcs
 *date  : 2020/10/20
 *
 **/
class Fragment1 :BaseFragment(R.layout.frag1){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        Log.e("mll","11111111")
//        tv_text.findNavController().navigate(R.id.framnt1)
    }
}