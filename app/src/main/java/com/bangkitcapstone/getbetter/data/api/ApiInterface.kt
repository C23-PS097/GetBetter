package com.bangkitcapstone.getbetter.data.api

import com.bangkitcapstone.getbetter.model.SearchResponse
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface ApiInterface {
    @GET("search")
    suspend fun search(
        @Header("Cookie") refreshToken : String,
        @Query("key") key: String
    ): SearchResponse

}