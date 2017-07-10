package com.weavey.xnotes.base

import android.content.Context
import java.lang.ref.WeakReference

/**
 * Created by Weavey on 2017-06-21.
 */

open class BasePresenter<V: BaseView,M: BaseModel> : BasePresenterInfc{


    protected var mContext: WeakReference<Context>? = null
    protected var mView: V?=null
    protected var mModel: M?=null

    constructor(baseView: V,baseModel: M){

        mView = baseView
        mModel = baseModel


    }

    override fun onCreate(context: Context) {

        mContext = WeakReference<Context>(context)
        mModel?.onCreate()

    }

    override fun onDestory() {
    }


    fun getContext(): Context?{

        return mContext?.get()
    }


}