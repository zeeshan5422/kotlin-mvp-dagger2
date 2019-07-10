package com.ogulcan.android.mvp.app.data.db.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/* ---  Created by akhtarz on 7/10/2019. ---*/
@Entity(tableName = "Test")
data class Test(
        @PrimaryKey(autoGenerate = true) val id: Int,
        val zone: String,
        val zoneCity: String
)