package com.weavey.xnotes.ui_act.contract

import com.weavey.xnotes.base.BaseModel
import com.weavey.xnotes.base.BasePresenter
import com.weavey.xnotes.base.BaseView

/**
 * Created by BINGLI-021 on 2017-06-15.
 */

interface SplashContract {

    interface View : BaseView {

        fun baeView()
    }

    interface Model : BaseModel{

        fun baseModel()
    }

    abstract class Presenter(baseView: View, baseModel: Model) : BasePresenter<View, Model>(baseView, baseModel) {

        abstract fun basePresenter()

    }

}
