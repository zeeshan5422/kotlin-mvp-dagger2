package com.ogulcan.android.mvp.app.di.module

import android.app.Activity
import com.ogulcan.android.mvp.app.di.scope.PerActivity
import com.ogulcan.android.mvp.app.ui.main.MainContract
import com.ogulcan.android.mvp.app.ui.main.MainPresenter
import dagger.Module
import dagger.Provides

/**
 * Created by ogulcan on 07/02/2018.
 */
@Module
class ActivityModule(private var activity: Activity) {

    @PerActivity
    @Provides
    fun provideActivity(): Activity {
        return activity
    }

    @PerActivity
    @Provides
    fun providePresenter(): MainContract.Presenter {
        return MainPresenter()
    }

}