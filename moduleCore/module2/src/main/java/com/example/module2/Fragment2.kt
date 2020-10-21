package com.example.module2

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
class Fragment2 : BaseFragment(R.layout.frag){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("mll","2222")
        tv_text.text="22222"
    }
}