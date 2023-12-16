package com.example.cleanjpc.utils

sealed class AppResult<out T> {
    data class Success<out T>(val successData: T) : AppResult<T>()
    class Error(
        internal val exception: java.lang.Exception,
        val message: String? = exception.localizedMessage
    ) : AppResult<Nothing>()
}