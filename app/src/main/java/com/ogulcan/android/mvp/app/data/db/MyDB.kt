package com.ogulcan.android.mvp.app.data.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.ogulcan.android.mvp.app.data.db.entities.Test

/* ---  Created by akhtarz on 7/10/2019. ---*/
@Database(
        entities = arrayOf(Test::class),
        version = 1,
        exportSchema = false
)
abstract class MyDB : RoomDatabase() {

    abstract fun myDbDao(): MyDBInterface

}