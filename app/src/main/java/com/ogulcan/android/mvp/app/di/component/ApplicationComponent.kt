package com.ogulcan.android.mvp.app.di.component

import com.ogulcan.android.mvp.app.BaseApp
import com.ogulcan.android.mvp.app.data.db.MyDB
import com.ogulcan.android.mvp.app.data.db.MyDBInterface
import com.ogulcan.android.mvp.app.di.module.ApplicationModule
import com.ogulcan.android.mvp.app.di.module.RoomModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by ogulcan on 07/02/2018.
 */
@Singleton
@Component(
        modules = arrayOf(
                ApplicationModule::class,
                RoomModule::class
        )
)
interface ApplicationComponent {

    fun inject(application: BaseApp)

    fun injectMyDatabase(): MyDB

    fun injectmyDBInterfce(): MyDBInterface

}