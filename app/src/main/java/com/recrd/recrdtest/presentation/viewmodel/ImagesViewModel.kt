package com.recrd.recrdtest.presentation.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.recrd.recrdtest.domain.models.Cat
import com.recrd.recrdtest.domain.usecases.GetAllImagesUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


data class ImageScreenState(
    val loading: Boolean = false,
    val images: List<Cat> = arrayListOf(),
    val error: String? = null,
    val curPage: Int = 0
)



class ImagesViewModel(
    private val getAllImagesUseCase: GetAllImagesUseCase
): ViewModel() {
    var state by mutableStateOf(ImageScreenState())


    fun onAction(action: Action){
        when (action){
            is Action.LoadMoreItems-> {
                fetchImages(action.apiKey)
            }
        }
    }

    private fun fetchImages(apiKey: String) {
        viewModelScope.launch(Dispatchers.IO) {

        }
    }


    sealed interface Action{
        data class LoadMoreItems(val apiKey: String): Action
    }

}