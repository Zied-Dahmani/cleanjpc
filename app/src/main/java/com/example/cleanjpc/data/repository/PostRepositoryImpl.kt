package com.example.cleanjpc.data.repository

import NetworkManager.isOnline
import Post
import PostRepository
import Utils.handleApiError
import Utils.handleSuccess
import android.content.Context
import com.example.cleanjpc.api.PostApi
import com.example.cleanjpc.utils.AppResult
import noNetworkConnectivityError

class PostRepositoryImpl (
    private val api: PostApi,
    private val context: Context,
    ) : PostRepository {

        override suspend fun getAllPosts(): AppResult<Post> =
            if (isOnline(context)) {
                try {
                    val response = api.getAllPosts()
                    if (response.isSuccessful) {
                        handleSuccess(response)
                    } else {
                        handleApiError(response)
                    }
                } catch (e: Exception) {
                    AppResult.Error(e)
                }
            } else {
                context.noNetworkConnectivityError()
            }
    }