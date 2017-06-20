package com.weavey.xnotes.base

import android.app.Application

/**
 * Created by BINGLI-021 on 2017-05-10.
 */

class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        initConfig()
    }

    private fun initConfig() {


    }


    companion object {

        var mBaseApplication: BaseApplication? = null
            private set

    }

}
