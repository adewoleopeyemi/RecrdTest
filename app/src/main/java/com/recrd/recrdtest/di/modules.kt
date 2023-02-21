package com.recrd.recrdtest.di

import com.recrd.recrdtest.data.http.HttpClient
import com.recrd.recrdtest.data.http.HttpClientImpl
import org.koin.dsl.module

val AppModule = module {

}

val DataModule = module {
    factory<HttpClient> { HttpClientImpl() }
}