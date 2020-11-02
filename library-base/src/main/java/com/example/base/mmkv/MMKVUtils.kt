package com.example.base.mmkv

import com.tencent.mmkv.MMKV


/**
 *author: zcs
 *date  : 2020/10/21
 *  K:V 存储类 代替SharePreference
 **/
object MMKVUtils {

    private var kv: MMKV? = null

    init {
        kv = MMKV.defaultMMKV()
    }

      fun put(key: String?, v: Any) {
        when (v) {
            is String -> {
                kv?.encode(key, v)
            }
            is Int -> {
                kv?.encode(key, v)
            }
            is Boolean -> {
                kv?.encode(key, v)
            }
            is Float -> {
                kv?.encode(key, v)
            }
            is Long -> {
                kv?.encode(key, v)
            }
            is Double -> {
                kv?.encode(key, v)
            }
            is ByteArray -> {
                kv?.encode(key, v)
            }
            else -> {
                kv?.encode(key, v.toString())
            }
        }

    }

    fun getInt(key: String?): Int? {
        return kv?.decodeInt(key, 0)
    }

    fun getDouble(key: String?): Double? {
        return kv?.decodeDouble(key, 0.00)
    }

    fun getLong(key: String?): Long? {
        return kv?.decodeLong(key, 0L)
    }

    fun getBoolean(key: String?): Boolean? {
        return kv?.decodeBool(key, false)
    }

    fun getFloat(key: String?): Float? {
        return kv?.decodeFloat(key, 0f)
    }

    fun getBytes(key: String?): ByteArray? {
        return kv?.decodeBytes(key)
    }

    fun getString(key: String?): String? {
        return kv?.decodeString(key, "")
    }

    /**
     * 移除某个key对
     *
     * @param key
     */
    fun removeKey(key: String?) {
        kv?.removeValueForKey(key)
    }

    /**
     * 清除所有key
     */
    fun clearAll() {
        kv?.clearAll()
    }



}