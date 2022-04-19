package com.yash1307.roomdi.repository

import androidx.lifecycle.LiveData
import com.yash1307.roomdi.dao.DaoInterface
import com.yash1307.roomdi.db.Database
import com.yash1307.roomdi.entity.Details
import javax.inject.Inject

class DetailsRepository @Inject constructor(private val database: Database) {

    val detailLiveData: LiveData<List<Details>>
    get() =database.getDao().getDetails()

    suspend fun insertDetails(details: Details) {
        database.getDao().insertDetails(details)
    }
}