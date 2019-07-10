package com.ogulcan.android.mvp.app

import android.app.Application
import android.content.Context
import com.ogulcan.android.mvp.app.data.db.MyDB
import com.ogulcan.android.mvp.app.di.component.ApplicationComponent
import com.ogulcan.android.mvp.app.di.component.DaggerApplicationComponent
import com.ogulcan.android.mvp.app.di.module.ApplicationModule
import com.ogulcan.android.mvp.app.di.module.RoomModule
import javax.inject.Inject

/**
 * Created by ogulcan on 07/02/2018.
 */
class BaseApp : Application() {

    internal var component: ApplicationComponent? = null
        get() = field


    // If you need data base at application level
//    @Inject
//    lateinit var myDbInstance: MyDB

    override fun onCreate() {
        super.onCreate()

        instance = this
        setup()

        if (BuildConfig.DEBUG) {
            // Maybe TimberPlant etc.
        }
    }

    fun setup() {
        component = DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .roomModule(RoomModule())
                .build()
        component?.inject(this)

    }

    fun getApplicationComponent(): ApplicationComponent {
        return this.component!!
    }

    companion object {
        lateinit var instance: BaseApp private set

        operator fun get(context: Context): BaseApp = context.applicationContext as BaseApp
    }
}