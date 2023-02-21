package com.recrd.recrdtest.data.datasource

import com.recrd.recrdtest.data.http.HttpClientImpl
import com.recrd.recrdtest.data.model.ImagesResponseData

class ImagesRemoteDataSourceImpl(
    private val httpClientImpl: HttpClientImpl
): ImagesRemoteDataSource {
    override suspend fun getImages(apiKey: String, page: Int): ImagesResponseData {
        val response = httpClientImpl.getClientService().getImages(apiKey = apiKey, page = page)
        if (response.isSuccessful){
            return response.body()!!
        }
        throw Exception("Couldn't fetch images")
    }
}