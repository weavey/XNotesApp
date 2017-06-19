package com.weavey.xnotes.utils

import android.app.Activity
import android.content.SharedPreferences
import com.weavey.xnotes.base.BaseApplication
import com.weavey.xnotes.base.BaseTag

/**
 * Created by Weavey on 2017-06-19.
 */

object SPUtils{

    var sp: SharedPreferences? = null

    init {
        sp = BaseApplication.mApplication?.getSharedPreferences(BaseTag.SP_DATA,Activity.MODE_PRIVATE)
    }

    fun commit(key: String,value: String){

        getSP()?.edit()?.putString(key,value)
    }

    fun commit(key: String,value: Boolean){

        getSP()?.edit()?.putBoolean(key,value)
    }

    fun commit(key: String,value: Int){

        getSP()?.edit()?.putInt(key,value)
    }

    fun get(key: String,def: String):String?{

        return getSP()?.getString(key,def)
    }

    fun get(key: String,def: Boolean):Boolean?{

        return getSP()?.getBoolean(key,def)
    }

    fun get(key: String,def: Int):Int?{

        return getSP()?.getInt(key,def)
    }

    private fun getSP() = sp ?: BaseApplication.mApplication?.getSharedPreferences(BaseTag.SP_DATA,Activity.MODE_PRIVATE)


}