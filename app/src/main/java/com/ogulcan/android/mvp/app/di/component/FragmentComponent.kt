package com.ogulcan.android.mvp.app.di.component

import com.ogulcan.android.mvp.app.di.module.FragmentModule
import com.ogulcan.android.mvp.app.di.scope.PerFragment
import com.ogulcan.android.mvp.app.ui.about.AboutFragment
import com.ogulcan.android.mvp.app.ui.list.ListFragment
import dagger.Component

/**
 * Created by ogulcan on 07/02/2018.
 */
@PerFragment
@Component(
        dependencies = arrayOf(ActivityComponent::class),
        modules = arrayOf(FragmentModule::class))
interface FragmentComponent {

    fun inject(aboutFragment: AboutFragment)

    fun inject(listFragment: ListFragment)

}