package com.recrd.recrdtest.data.repository

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.recrd.recrdtest.data.datasource.FakeDataSource
import com.recrd.recrdtest.data.datasource.ImagesRemoteDataSource
import com.recrd.recrdtest.data.model.CatData
import com.recrd.recrdtest.domain.models.Cat
import com.recrd.recrdtest.domain.repository.ImagesRepository
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.setMain
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule
import org.junit.Assert.*


@ExperimentalCoroutinesApi
class ImagesRepositoryImplTest{
    private lateinit var imagesRemoteDataSource: ImagesRemoteDataSource
    private lateinit var imagesRepository: ImagesRepository
    @get:Rule
    var rule: TestRule = InstantTaskExecutorRule()
    var dispatcher = StandardTestDispatcher()

    @Before
    fun setUp(){
        imagesRemoteDataSource =FakeDataSource()
        imagesRepository = ImagesRepositoryImpl(imagesRemoteDataSource)
        Dispatchers.setMain(dispatcher)

    }

    @Test
    fun `check if images are being returned by the repository`(){
        var cats = mutableListOf<Cat>()
        runBlocking {
            imagesRepository.getImages("1", 1).fold(
                onSuccess = {
                    cats = it.toMutableList()
                },
                onFailure = {
                    println("There was an ${it.message}")
                }
            )
            delay(3000)
        }
        assertEquals(cats[0].id , "1")
    }
}