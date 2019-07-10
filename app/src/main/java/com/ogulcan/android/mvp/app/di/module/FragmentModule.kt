package com.ogulcan.android.mvp.app.di.module

import com.ogulcan.android.mvp.app.data.api.ApiServiceInterface
import com.ogulcan.android.mvp.app.data.db.MyDB
import com.ogulcan.android.mvp.app.di.scope.PerFragment
import com.ogulcan.android.mvp.app.ui.about.AboutContract
import com.ogulcan.android.mvp.app.ui.about.AboutPresenter
import com.ogulcan.android.mvp.app.ui.list.ListContract
import com.ogulcan.android.mvp.app.ui.list.ListPresenter
import dagger.Module
import dagger.Provides

/**
 * Created by ogulcan on 07/02/2018.
 */
@Module
class FragmentModule {

    @Provides
    @PerFragment
    fun provideAboutPresenter(): AboutContract.Presenter {
        return AboutPresenter()
    }

    @Provides
    @PerFragment
    fun provideListPresenter(myDb: MyDB): ListContract.Presenter {
        return ListPresenter(myDb)
    }

    @Provides
    @PerFragment
    fun provideApiService(): ApiServiceInterface {
        return ApiServiceInterface.create()
    }
}