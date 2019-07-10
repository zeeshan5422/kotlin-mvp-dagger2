package com.ogulcan.android.mvp.app.di.component

import com.ogulcan.android.mvp.app.data.db.MyDB
import com.ogulcan.android.mvp.app.data.db.MyDBInterface
import com.ogulcan.android.mvp.app.di.module.ActivityModule
import com.ogulcan.android.mvp.app.di.scope.PerActivity
import com.ogulcan.android.mvp.app.ui.main.MainActivity
import dagger.Component

/**
 * Created by ogulcan on 07/02/2018.
 */
@PerActivity
@Component(
        dependencies = arrayOf(ApplicationComponent::class),
        modules = arrayOf(ActivityModule::class))
interface ActivityComponent {

    fun inject(mainActivity: MainActivity)

    fun injectMyDatabase(): MyDB

    fun injectmyDBInterfce(): MyDBInterface

    /*@Component.Builder
    interface Builder {

        fun appModule(appComponent: ApplicationComponent): Builder

        fun build(): ActivityComponent
    }*/
}