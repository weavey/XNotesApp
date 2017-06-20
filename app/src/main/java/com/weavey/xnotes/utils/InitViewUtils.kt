package com.weavey.xnotes.utils

import android.graphics.drawable.ColorDrawable
import android.support.v4.widget.SwipeRefreshLayout
import android.view.KeyEvent
import android.view.View
import android.widget.LinearLayout
import android.widget.PopupWindow

/**
 * Created by msi-pc on 2017/6/8.
 */
object InitViewUtils {


    fun initSwipeRefreshLayout(swipeRefreshLayout: SwipeRefreshLayout) {

    }

    fun initPopupWindow(popupLayout: View): PopupWindow {

        val window = PopupWindow(popupLayout, LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT)
        window.setBackgroundDrawable(ColorDrawable())
        window.isOutsideTouchable = true
        window.isTouchable = true
        window.isFocusable = true
        window.animationStyle = android.R.style.Animation_Dialog
        popupLayout.setOnKeyListener { v, keyCode, event ->
            if (keyCode == KeyEvent.KEYCODE_BACK&&window.isShowing)
            {
                window.dismiss()
                return@setOnKeyListener true
            }

            false
        }
        return window;

    }

}
