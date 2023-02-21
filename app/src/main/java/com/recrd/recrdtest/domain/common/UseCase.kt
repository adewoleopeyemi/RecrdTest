package com.recrd.recrdtest.domain.common

interface UseCase<in apiKey, in Input, Output> {
    suspend fun execute(apiKey: apiKey, input: Input): Response<Output>
}