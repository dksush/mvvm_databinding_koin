package com.example.androidarchitecture.data.datasource.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.androidarchitecture.data.datasource.database.dao.BlogDao
import com.example.androidarchitecture.data.datasource.database.dao.ImageDao
import com.example.androidarchitecture.data.datasource.database.dao.KinDao
import com.example.androidarchitecture.data.datasource.database.dao.MovieDao
import com.example.androidarchitecture.data.response.BlogData
import com.example.androidarchitecture.data.response.ImageData
import com.example.androidarchitecture.data.response.KinData
import com.example.androidarchitecture.data.response.MovieData


@Database(
    entities = [BlogData::class, MovieData::class, ImageData::class, KinData::class],
    version = 1, exportSchema = false
)
abstract class SearchHistDatabase : RoomDatabase() {

    abstract fun blogDao(): BlogDao
    abstract fun movieDao(): MovieDao
    abstract fun imageDao(): ImageDao
    abstract fun kinDao(): KinDao

}