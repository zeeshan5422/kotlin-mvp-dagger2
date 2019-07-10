package com.ogulcan.android.mvp.app.di.module

import android.arch.persistence.room.Room
import com.ogulcan.android.mvp.app.BaseApp
import com.ogulcan.android.mvp.app.data.db.MyDB
import com.ogulcan.android.mvp.app.data.db.MyDBInterface
import com.ogulcan.android.mvp.app.di.scope.PerApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/* ---  Created by akhtarz on 7/10/2019. ---*/
@Module
class RoomModule {

   /* @Singleton
    @Provides
    fun provideRoomModule(context: BaseApp): MyDB {
        return MyDBInterface.createDB(context)
    }

    @Singleton
    @Provides
    fun providesProductDao(demoDatabase: MyDB): MyDBInterface {
        return MyDBInterface.createMyDBInterface(demoDatabase)
    }*/

    // we can also initilize our DB by below mentioned commented code
    @Singleton
    @Provides
    fun provideRoomModule(context: BaseApp): MyDB {
        return Room.databaseBuilder(context,
                MyDB::class.java ,"test.db")
                .allowMainThreadQueries()
                .build()
    }

    @Singleton
    @Provides
    fun providesProductDao( demoDatabase: MyDB): MyDBInterface {
        return demoDatabase.myDbDao()
    }
}