package com.recrd.recrdtest.domain.usecases

import com.recrd.recrdtest.domain.common.Response
import com.recrd.recrdtest.domain.common.UseCase
import com.recrd.recrdtest.domain.models.Cat
import com.recrd.recrdtest.domain.repository.ImagesRepository

class GetAllImagesUseCase(
    private val imagesRepository: ImagesRepository
): UseCase<String, Int, List<Cat>>{
    override suspend fun execute(apiKey: String, page: Int): Response<List<Cat>> {
        return imagesRepository.getImages(apiKey, page)
    }

}