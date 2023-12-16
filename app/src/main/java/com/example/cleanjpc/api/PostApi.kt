package com.example.cleanjpc.api

import Post
import retrofit2.Response
import retrofit2.http.GET

interface PostApi {
    @GET("/api/posts")
    suspend fun getAllPosts(): Response<Post>


    
}