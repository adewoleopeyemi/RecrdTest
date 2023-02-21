package com.recrd.recrdtest.domain.repository

import com.recrd.recrdtest.domain.common.Response
import com.recrd.recrdtest.domain.models.ImagesResponse

interface ImagesRepository {
    suspend fun getImages(apiKey: String, page: Int): Response<ImagesResponse>
}