package com.weavey.xnotes.ui_act.view

import android.os.Bundle

import com.weavey.xnotes.R
import com.weavey.xnotes.base.ActivityFragmentInject
import com.weavey.xnotes.base.BaseActivity
import com.weavey.xnotes.ui_act.contract.SplashContract
import com.weavey.xnotes.ui_act.model.SplashModel
import com.weavey.xnotes.ui_act.presenter.SplashPresenter

@ActivityFragmentInject(contentViewId = R.layout.act_welcome)
class SplashActivity : BaseActivity<SplashPresenter>(),SplashContract.View {

    override fun getPresenter(): SplashPresenter {

        return  SplashPresenter(this,SplashModel())
    }

    override fun initView() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun baeView() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
