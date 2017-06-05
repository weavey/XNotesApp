package com.weavey.xnotes.base

import android.app.Application

/**
 * Created by BINGLI-021 on 2017-05-10.
 */

class BaseApplication : Application() {

    private var mApplication : BaseApplication? =null

    override fun onCreate() {
        super.onCreate()
    }
}
