package com.example.cleanjpc.domain.use_case

import Post
import PostRepository
import com.example.cleanjpc.utils.AppResult

class PostUseCase(private val postRepository: PostRepository) {
    suspend fun getAllPosts(): AppResult<Post> =
        postRepository.getAllPosts()
}