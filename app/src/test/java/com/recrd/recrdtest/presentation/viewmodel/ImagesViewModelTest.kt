package com.recrd.recrdtest.presentation.viewmodel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.recrd.recrdtest.data.datasource.FakeDataSource
import com.recrd.recrdtest.data.datasource.ImagesRemoteDataSource
import com.recrd.recrdtest.data.repository.ImagesRepositoryImpl
import com.recrd.recrdtest.domain.repository.ImagesRepository
import com.recrd.recrdtest.domain.usecases.GetAllImagesUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.setMain
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule
import org.junit.Assert.*


class ImagesViewModelTest{
    private lateinit var imagesRemoteDataSource: ImagesRemoteDataSource
    private lateinit var imagesRepository: ImagesRepository
    private lateinit var imagesViewModel: ImagesViewModel
    @get:Rule
    var rule: TestRule = InstantTaskExecutorRule()
    var dispatcher = StandardTestDispatcher()

    @Before
    fun setUp(){
        imagesRemoteDataSource =FakeDataSource()
        imagesRepository = ImagesRepositoryImpl(imagesRemoteDataSource)
        imagesViewModel = ImagesViewModel(GetAllImagesUseCase(imagesRepository))
        Dispatchers.setMain(dispatcher)

    }




    @Test
    fun `check if state is correctly updated`(){
        runBlocking {
            imagesViewModel.onAction(ImagesViewModel.Action.LoadMoreItems("abc"))
            delay(2000)
        }
        val state = imagesViewModel.state
        assertEquals(state.images.size, 1)
    }
}