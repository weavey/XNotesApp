package com.weavey.xnotes.base

import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

/**
 * Activity、Fragment初始化的用到的注解
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(AnnotationTarget.CLASS, AnnotationTarget.FILE)
annotation class ActivityFragmentInject(

        val contentViewId: Int = -1,

        val toolbarTitle: Int = -1,

        val toolbarTitleStr: String = "",

        val menuId: Int = -1,

        val enableSlidr: Boolean = false,

        val hasNavigationView: Boolean = false,

        val handleRefreshLayout: Boolean = false,



        val toolbarIndicator: Int = -1,

        val menuDefaultCheckedItem: Int = -1)
