package com.example.baseapplication

import androidx.multidex.MultiDexApplication
import com.tencent.mmkv.MMKV

/**
 *author: zcs
 *date  : 2020/10/15
 *
 **/
class App : MultiDexApplication()  {


    override fun onCreate() {
        super.onCreate()
        MMKV.initialize(this)

    }
}