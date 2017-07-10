package com.weavey.xnotes.base

/**
 * Created by BINGLI-021 on 2017-06-15.
 */
interface BaseView {

    fun <T> setData1(data: T)

    fun <T> setData2(data: T)

    fun <T> setData3(data: T)

    fun <T> setDataList1(data: List<T>)

    fun <T> setDataList2(data: List<T>)

    fun <T> setDataList3(data: List<T>)
}
