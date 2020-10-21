package com.example.module1

import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import com.example.base.BaseFragment
import kotlinx.android.synthetic.main.frag.*

/**
 *author: zcs
 *date  : 2020/10/20
 *
 **/
class HomeFragment :BaseFragment(R.layout.frag){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tv_text.text="HomeFragmentHomeFragmentHomeFragmentHomeFragmentHomeFragmentHomeFragmentHomeFragmentHomeFragmentHomeFragmentHomeFragmentHomeFragmentHomeFragmentHomeFragmentHomeFragmentHomeFragmentHomeFragmentHomeFragmentHomeFragmentHomeFragmentHomeFragmentHomeFragmentHomeFragmentHomeFragmentHomeFragmentHomeFragmentHomeFragmentHomeFragmentHomeFragmentHomeFragmentHomeFragmentHomeFragmentHomeFragmentHomeFragmentHomeFragmentHomeFragmentHomeFragmentHomeFragment"
        tv_text.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_twoHome)
        }
    }
}