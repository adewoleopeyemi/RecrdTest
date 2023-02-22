package com.recrd.recrdtest.domain.repository

import com.recrd.recrdtest.domain.common.Response
import com.recrd.recrdtest.domain.models.Cat

interface ImagesRepository {
    suspend fun getImages(apiKey: String, page: Int):  Response<List<Cat>>
}