package com.recrd.recrdtest.data.datasource

import com.recrd.recrdtest.data.http.HttpClient
import com.recrd.recrdtest.data.http.HttpClientImpl
import com.recrd.recrdtest.data.model.CatResponseData
import com.recrd.recrdtest.data.model.ImagesResponseData

class ImagesRemoteDataSourceImpl(
    private val httpClient: HttpClient
): ImagesRemoteDataSource {
    override suspend fun getImages(apiKey: String, page: Int): List<CatResponseData> {
        val response = httpClient.getClientService().getImages(apiKey = apiKey, page = page)
        println("CalledFrome $response")
        if (response.isSuccessful){
            return response.body()!!
        }
        throw Exception("Couldn't fetch images")
    }
}