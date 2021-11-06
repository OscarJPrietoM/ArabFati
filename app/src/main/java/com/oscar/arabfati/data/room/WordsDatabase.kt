package com.oscar.arabfati.data.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.oscar.arabfati.data.model.CategoryModel
import com.oscar.arabfati.data.model.WordModel

@Database(entities = arrayOf(WordModel::class,CategoryModel::class), version = 1)
abstract class WordsDatabase :RoomDatabase() {
    abstract fun wordsDAO(): WordsDao
    abstract fun categoriesDao(): CategoriesDao
}