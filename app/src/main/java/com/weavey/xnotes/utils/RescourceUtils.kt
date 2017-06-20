package com.weavey.xnotes.utils

import android.content.Context
import android.graphics.drawable.Drawable
import android.support.annotation.ColorRes
import android.support.annotation.DimenRes
import android.support.annotation.DrawableRes
import android.support.annotation.StringRes
import android.support.v4.content.ContextCompat
import com.weavey.xnotes.base.BaseApplication

object RescourceUtils {

    fun getDrawable(@DrawableRes id: Int): Drawable {

        return ContextCompat.getDrawable(BaseApplication.mBaseApplication,id);
    }

    fun getColor(@ColorRes id:Int):Int{


        return ContextCompat.getColor(BaseApplication.mBaseApplication,id);
    }

    fun getString(@StringRes id:Int):String{

        return BaseApplication.mBaseApplication!!.resources.getString(id);
    }

    fun getDimens(@DimenRes id : Int):Float{

        return BaseApplication.mBaseApplication!!.resources.getDimension(id);
    }

}