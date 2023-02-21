package com.recrd.recrdtest.data.repository

import com.recrd.recrdtest.data.datasource.ImagesRemoteDataSourceImpl
import com.recrd.recrdtest.data.model.toDomain
import com.recrd.recrdtest.domain.common.Response
import com.recrd.recrdtest.domain.models.ImagesResponse
import com.recrd.recrdtest.domain.repository.ImagesRepository

class ImagesRepositoryImpl(
    private val imagesRemoteDataSourceImpl: ImagesRemoteDataSourceImpl
): ImagesRepository {
    override suspend fun getImages(apiKey: String, page: Int): Response<ImagesResponse> {
        return try{
            val response = imagesRemoteDataSourceImpl.getImages(apiKey, page)
            Response.success(response.toDomain())
        }catch (e: Exception){
            Response.failure(e)
        }
    }
}