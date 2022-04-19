package com.yash1307.roomdi.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.yash1307.roomdi.entity.Details

@Dao
interface DaoInterface {

    @Insert
    suspend fun insertDetails(details: Details)

    @Query("SELECT * FROM details")
    fun getDetails(): LiveData<List<Details>>
}