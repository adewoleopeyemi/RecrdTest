package com.recrd.recrdtest.data.repository

import com.recrd.recrdtest.data.datasource.ImagesRemoteDataSource
import com.recrd.recrdtest.data.datasource.ImagesRemoteDataSourceImpl
import com.recrd.recrdtest.data.model.toDomain
import com.recrd.recrdtest.domain.common.Response
import com.recrd.recrdtest.domain.models.ImagesResponse
import com.recrd.recrdtest.domain.repository.ImagesRepository

class ImagesRepositoryImpl(
    private val imagesRemoteDataSource: ImagesRemoteDataSource
): ImagesRepository {
    override suspend fun getImages(apiKey: String, page: Int): Response<ImagesResponse> {
        return try{
            val response = imagesRemoteDataSource.getImages(apiKey, page)
            Response.success(response.toDomain())
        }catch (e: Exception){
            Response.failure(e)
        }
    }
}