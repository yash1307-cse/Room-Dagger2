package com.yash1307.roomdi.viewmodel

import android.telecom.Call
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yash1307.roomdi.entity.Details
import com.yash1307.roomdi.repository.DetailsRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

class DetailsViewModel @Inject constructor(private val detailsRepository: DetailsRepository) : ViewModel() {

    val detailsLiveData:LiveData<List<Details>>
    get() = detailsRepository.detailLiveData

     fun insertDetails(details:Details) = viewModelScope.launch {
        detailsRepository.insertDetails(details)
    }

}