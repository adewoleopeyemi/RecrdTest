package com.recrd.recrdtest.data.datasource

import com.recrd.recrdtest.data.model.CatData

interface ImagesRemoteDataSource {
    suspend fun getImages(apiKey:String, page: Int): List<CatData>
}