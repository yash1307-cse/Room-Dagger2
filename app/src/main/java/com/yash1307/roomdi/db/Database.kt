package com.yash1307.roomdi.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.yash1307.roomdi.dao.DaoInterface
import com.yash1307.roomdi.entity.Details

@Database(entities = [Details::class], version = 1)
abstract class Database: RoomDatabase() {

    abstract fun getDao(): DaoInterface
}