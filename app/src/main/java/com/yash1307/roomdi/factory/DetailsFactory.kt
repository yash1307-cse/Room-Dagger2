package com.yash1307.roomdi.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.yash1307.roomdi.repository.DetailsRepository
import com.yash1307.roomdi.viewmodel.DetailsViewModel
import javax.inject.Inject

class DetailsFactory @Inject constructor(private val detailsRepository: DetailsRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return DetailsViewModel(detailsRepository) as T
    }
}