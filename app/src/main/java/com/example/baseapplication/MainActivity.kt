package com.example.baseapplication

import android.graphics.Color
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import androidx.viewpager2.widget.ViewPager2
import com.example.base.BaseActivity
import com.example.baseapplication.adapter.HomeVpAdapter
import kotlinx.android.synthetic.main.activity_main.*
import me.majiajie.pagerbottomtabstrip.NavigationController
import me.majiajie.pagerbottomtabstrip.item.BaseTabItem
import me.majiajie.pagerbottomtabstrip.item.NormalItemView


class MainActivity : BaseActivity(R.layout.activity_main) {

    private var mNavigationController: NavigationController? = null

    override fun initView(savedInstanceState: Bundle?) {
        mNavigationController = mNav?.custom()
            ?.enableAnimateLayoutChanges()
            ?.addItem(newItem(R.mipmap.navi_home_02, R.mipmap.navi_home_01, "111"))
            ?.addItem(newItem(R.mipmap.navi_home_02, R.mipmap.navi_home_01, "22"))
            ?.addItem(newItem(R.mipmap.navi_home_02, R.mipmap.navi_home_01, "33"))
            ?.build()
        mVp.adapter = HomeVpAdapter(this)
        mVp.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                if (mNavigationController != null && mNavigationController?.selected != position) {
                    mNavigationController?.setSelect(position)
                }
            }
        })
        mVp?.offscreenPageLimit = 3
        mVp?.isUserInputEnabled = false
        mNavigationController?.addSimpleTabItemSelectedListener { index: Int, _: Int ->
            mVp.currentItem = index
        }
    }

    private fun newItem(drawable: Int, checkedDrawable: Int, text: String): BaseTabItem {
        val normalItemView = NormalItemView(this)
        normalItemView.initialize(drawable, checkedDrawable, text)
        normalItemView.setTextDefaultColor(Color.GRAY)
        normalItemView.setTextCheckedColor(
            ResourcesCompat.getColor(
                resources,
                R.color.colorPrimary,
                null
            )
        )
        return normalItemView
    }
}

