package com.weavey.xnotes.base

import android.content.Context
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by Weavey on 2017-06-19.
 */

abstract class BaseActivity<P : BasePresenterInfc>() : AppCompatActivity() {

    protected var mPresenter: P? = null
    protected var mContext: Context? = null
    protected var mSavedInstanceState: Bundle? = null
    private var mContentViewId: Int? =null

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        mContext = this
        mSavedInstanceState = savedInstanceState;
        mPresenter?.onCreate(mContext as BaseActivity<P>)

        doBeforeSetContentView()
        setContentView(mContentViewId!!)
        doAfterSetContentView()
        initView()
        initData()

    }

    private fun doBeforeSetContentView() {

        if (javaClass.isAnnotationPresent(ActivityFragmentInject::class.java)) {
            val annotation = javaClass.getAnnotation(ActivityFragmentInject::class.java)
            mContentViewId = annotation.contentViewId
        } else {
            throw RuntimeException("Class must add annotations of ActivityFragmentInitParams.class")
        }
    }

    private fun doAfterSetContentView() {

    }

    abstract fun getPresenter():P

    abstract fun initView()

    fun initData(){

    }

     fun <T> setData1(data: T) {

    }

     fun <T> setData2(data: T) {

    }

     fun <T> setData3(data: T) {

    }

     fun <T> setDataList1(data: List<T>) {

    }

     fun <T> setDataList2(data: List<T>) {

    }

     fun <T> setDataList3(data: List<T>) {

    }


    override fun onDestroy() {
        super.onDestroy()

        mPresenter?.onDestory();

    }

}
