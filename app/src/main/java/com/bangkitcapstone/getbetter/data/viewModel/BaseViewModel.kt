package com.bangkitcapstone.getbetter.data.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.bangkitcapstone.getbetter.data.api.ApiRepository
import com.bangkitcapstone.getbetter.model.Resource
import kotlinx.coroutines.Dispatchers

class BaseViewModel(private val apiRepository: ApiRepository) : ViewModel() {

    fun search(refreshToken: String,key: String) = liveData(Dispatchers.IO) {
            emit(Resource.loading(data = null))
        try {
            emit(Resource.success(data = apiRepository.search(refreshToken, key)))
        } catch (exception: Exception) {
            emit(Resource.error(data = null, message = exception.message ?: "Error Occurred!"))
        }
    }

}