package com.weavey.xnotes.base

import android.app.Application
import com.weavey.xnotes.bean_litepal.NotesType
import com.weavey.xnotes.utils.SPUtils
import org.litepal.LitePalApplication

/**
 * Created by Weavey on 2017-05-10.
 */

class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        mApplication = this


    }

    fun initConfig(){

        LitePalApplication.initialize(mApplication)

    }

    fun initDB(){

        if (SPUtils.get(BaseConstant.DB_CREATE,false)==null)let {

            SPUtils.commit(BaseConstant.DB_CREATE,true)

            var type1: NotesType = NotesType(0,"默认",1)
            var type2: NotesType = NotesType(1,"工作",1)
            var type3: NotesType = NotesType(2,"生活",1)

            type1.save()
            type2.save()
            type3.save()
        }

    }

    companion object{

        var mApplication: BaseApplication? = null
            private set

    }
}
