package com.example.cleanjpc.di
import com.example.cleanjpc.presentation.viewmodel.PostsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        PostsViewModel(postUseCase = get())
    }
}