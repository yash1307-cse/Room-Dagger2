package com.yash1307.roomdi.module

import android.content.Context
import androidx.room.Room
import com.yash1307.roomdi.db.Database
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DetailsModule {

    @Singleton
    @Provides
    fun getDatabase(context: Context): Database {
        return Room.databaseBuilder(
            context,
            Database::class.java,
            "detailsdb"
        )
            .build()
    }
}