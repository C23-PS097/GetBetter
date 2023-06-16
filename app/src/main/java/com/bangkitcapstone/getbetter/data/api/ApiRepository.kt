package com.bangkitcapstone.getbetter.data.api

class ApiRepository (private val apiInterface: ApiInterface) {

    suspend fun search(refreshToken: String,key: String) = apiInterface.search(refreshToken, key)

}