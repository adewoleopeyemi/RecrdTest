package com.recrd.recrdtest.data.datasource

import com.recrd.recrdtest.data.http.HttpClient
import com.recrd.recrdtest.data.model.CatData

class ImagesRemoteDataSourceImpl(
    private val httpClient: HttpClient
): ImagesRemoteDataSource {
    override suspend fun getImages(apiKey: String, page: Int): List<CatData> {
        val response = httpClient.getClientService().getImages(apiKey = apiKey, page = page)
        println("CalledFrome $response")
        if (response.isSuccessful){
            return response.body()!!
        }
        throw Exception("Couldn't fetch images")
    }
}