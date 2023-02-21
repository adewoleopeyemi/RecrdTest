package com.recrd.recrdtest.data.datasource

import com.recrd.recrdtest.data.model.CatData

class FakeDataSource: ImagesRemoteDataSource {
    override suspend fun getImages(apiKey: String, page: Int): List<CatData> {
        return listOf(CatData("1", "www.google.com"))
    }

}