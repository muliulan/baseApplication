package com.example.module1

import android.os.Bundle
import android.view.View
import com.example.base.BaseFragment
import kotlinx.android.synthetic.main.frag.*

/**
 *author: zcs
 *date  : 2020/10/20
 *
 **/
class TwoHome : BaseFragment(R.layout.frag){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tv_text.text="TwoHome"

//        tv_text.findNavController().navigate(R.id.framnt1)
    }
}