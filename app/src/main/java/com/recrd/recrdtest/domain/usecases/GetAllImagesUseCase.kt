package com.recrd.recrdtest.domain.usecases

import com.recrd.recrdtest.domain.common.Response
import com.recrd.recrdtest.domain.common.UseCase
import com.recrd.recrdtest.domain.models.ImagesResponse
import com.recrd.recrdtest.domain.repository.ImagesRepository

class GetAllImagesUseCase(
    private val imagesRepository: ImagesRepository
): UseCase<String, Int, ImagesResponse>{
    override suspend fun execute(apiKey: String, page: Int): Response<ImagesResponse> {
        return imagesRepository.getImages(apiKey, page)
    }

}