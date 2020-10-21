package com.example.base

import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment

/**
 *author: zcs
 *date  : 2020/10/9
 *
 **/
abstract class BaseFragment(@LayoutRes contentLayoutId: Int) : Fragment(contentLayoutId) {
}
