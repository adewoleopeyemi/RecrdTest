package com.recrd.recrdtest.data.http

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class HttpClientImpl: HttpClient {

    override fun getClientService(): RecordTestService {
        val moshi = Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()
        return Retrofit.Builder()
            .baseUrl(HttpClient.BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
            .create(RecordTestService::class.java)
    }
}


interface HttpClient{
    fun getClientService(): RecordTestService

    companion object {
        val BASE_URL = "https://api.thecatapi.com/v1/"
    }
}