package com.example.cleanjpc.presentation.viewmodel

import Post
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cleanjpc.domain.use_case.PostUseCase
import com.example.cleanjpc.utils.AppResult
import kotlinx.coroutines.launch

class PostsViewModel(private val postUseCase: PostUseCase) : ViewModel() {
    private val postsList = MutableLiveData<Post?>()
    private val showError = MutableLiveData<String?>()

    fun getAllPosts() {
        viewModelScope.launch {
            when (val result = postUseCase.getAllPosts()) {
                is AppResult.Success -> {
                    postsList.value = result.successData
                    showError.value = null
                }

                is AppResult.Error -> {
                    showError.value = result.exception.message
                }
            }
        }
    }
}