package com.example.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import com.blankj.utilcode.util.BarUtils

/**
 *author: zcs
 *date  : 2020/10/9
 *
 **/
abstract class BaseActivity(@LayoutRes contentLayoutId: Int) : AppCompatActivity(contentLayoutId) {

    abstract fun initView(savedInstanceState: Bundle?)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStatus()
        initView(savedInstanceState)
    }

    //设置状态栏
    fun setStatus(){
        BarUtils.transparentStatusBar(this)
        BarUtils.setStatusBarLightMode(this,true)
    }

    fun setStatusBarLightMode(){
        BarUtils.setStatusBarLightMode(this,false)
    }



}
