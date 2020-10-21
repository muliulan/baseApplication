package com.example.baseapplication.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.module1.Fragment1
import com.example.module2.Fragment2
import com.example.module3.Fragment3

/**
 * @auther zcs on 2020/4/27
 *
 */
class HomeVpAdapter(fragment: FragmentActivity) : FragmentStateAdapter(fragment) {

    private val tabFragmentsCreators: Map<Int, () -> Fragment> = mapOf(
        0 to { Fragment1() },
        1 to { Fragment2() },
        2 to { Fragment3() }
//        2 to { ApiUtils.getApi(AccountApi::class.java).mineFrag }
    )

    override fun getItemCount() = tabFragmentsCreators.size

    override fun createFragment(position: Int): Fragment {
        return tabFragmentsCreators[position]?.invoke() ?: throw IndexOutOfBoundsException()
    }

}