package com.recrd.recrdtest.di

import com.recrd.recrdtest.data.http.HttpClient
import com.recrd.recrdtest.data.http.HttpClientImpl
import com.recrd.recrdtest.data.datasource.ImagesRemoteDataSource
import com.recrd.recrdtest.data.datasource.ImagesRemoteDataSourceImpl
import com.recrd.recrdtest.data.repository.ImagesRepositoryImpl
import com.recrd.recrdtest.domain.repository.ImagesRepository
import org.koin.dsl.module

val AppModule = module {

}

val DataModule = module {
    factory<HttpClient> { HttpClientImpl() }
    single<ImagesRemoteDataSource> { ImagesRemoteDataSourceImpl(get()) }
    single<ImagesRepository> { ImagesRepositoryImpl(get()) }
}