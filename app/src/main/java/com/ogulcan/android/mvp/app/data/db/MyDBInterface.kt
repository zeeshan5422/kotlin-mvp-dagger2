package com.ogulcan.android.mvp.app.data.db

import android.arch.persistence.room.*
import com.ogulcan.android.mvp.app.BaseApp
import com.ogulcan.android.mvp.app.data.db.entities.Test

/* ---  Created by akhtarz on 6/28/2019. ---*/
@Dao
interface MyDBInterface {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertZones(zones: List<Test>)

    @Query("SELECT DISTINCT zone from Test")
    fun getZone(): List<String>


    @Query("SELECT DISTINCT zoneCity from Test WHERE zone = :slectedZone")
    fun getCityByZone(slectedZone: String): List<String>

    companion object {
        fun createDB( context: BaseApp): MyDB {
            return Room.databaseBuilder(
                context,
                    MyDB::class.java, "Test.db"
            )
                .allowMainThreadQueries()
                .build()
        }

        fun createMyDBInterface(myDB: MyDB): MyDBInterface {
            return myDB.myDbDao()
        }
    }
}