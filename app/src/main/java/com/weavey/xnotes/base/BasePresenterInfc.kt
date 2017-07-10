package com.weavey.xnotes.base

import android.content.Context

/**
 * Created by Weavey on 2017-07-10.
 */

interface BasePresenterInfc {

    fun onCreate(context: Context)

    fun onDestory()
}
