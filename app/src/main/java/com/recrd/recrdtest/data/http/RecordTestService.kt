package com.recrd.recrdtest.data.http

import com.recrd.recrdtest.data.model.ImagesResponseData
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface RecordTestService {
    @GET("images/search")
    suspend fun getImages(@Header("x-api-key") apiKey: String, @Query("limit") limit: Int = 12, @Query("has_breeds") hasBreeds: Int =1, @Query("page")page: Int): Response<ImagesResponseData>

}