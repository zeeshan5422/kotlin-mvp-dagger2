package com.ogulcan.android.mvp.app.di.module

import android.app.Application
import android.arch.persistence.room.Room
import android.content.Context
import com.ogulcan.android.mvp.app.BaseApp
import com.ogulcan.android.mvp.app.data.db.MyDB
import com.ogulcan.android.mvp.app.data.db.MyDBInterface
import com.ogulcan.android.mvp.app.di.scope.PerApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by ogulcan on 07/02/2018.
 */
@Module
class ApplicationModule(private val baseApp: BaseApp) {

    @Provides
    @Singleton
    fun provideApplication(): BaseApp = baseApp


    @Singleton
    @Provides
    fun provideContext(): Context = baseApp.applicationContext

}