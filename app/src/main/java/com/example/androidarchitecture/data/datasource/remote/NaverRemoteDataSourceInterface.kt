package com.example.androidarchitecture.data.datasource.remote

import com.example.androidarchitecture.data.response.BlogData
import com.example.androidarchitecture.data.response.ImageData
import com.example.androidarchitecture.data.response.KinData
import com.example.androidarchitecture.data.response.MovieData

interface NaverRemoteDataSourceInterface {


    fun getBlog(
        query: String,
        start: Int,
        display: Int,
        success: (result: List<BlogData>) -> Unit,
        fail: (Throwable) -> Unit
    )

    fun getMovie(
        query: String,
        start: Int,
        display: Int,
        success: (List<MovieData>) -> Unit,
        fail: (Throwable) -> Unit
    )


    fun getImage(
        query: String,
        start: Int,
        display: Int,
        success: (List<ImageData>) -> Unit,
        fail: (Throwable) -> Unit
    )

    fun getKin(
        query: String,
        start: Int,
        display: Int,
        success: (List<KinData>) -> Unit,
        fail: (Throwable) -> Unit
    )
}