package com.example.base.mmkv;

import androidx.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * author: zcs
 * date  : 2020/10/21
 **/
public class MmkvKey {

    @StringDef({Mkey.FROM_TYPE_USER_ORDER, Mkey.FROM_TYPE_PARTNER})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Mkey {
        String FROM_TYPE_USER_ORDER = "1";
        String FROM_TYPE_PARTNER = "2";
    }

}
