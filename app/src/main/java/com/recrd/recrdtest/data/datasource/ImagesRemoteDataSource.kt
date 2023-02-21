package com.recrd.recrdtest.data.datasource

import com.recrd.recrdtest.data.model.CatResponseData
import com.recrd.recrdtest.data.model.ImagesResponseData

interface ImagesRemoteDataSource {
    suspend fun getImages(apiKey:String, page: Int): List<CatResponseData>
}