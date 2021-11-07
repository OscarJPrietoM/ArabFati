package com.oscar.arabfati.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.oscar.arabfati.data.dao.CategoriesDao
import com.oscar.arabfati.data.dao.WordsDao
import com.oscar.arabfati.data.model.CategoryModel
import com.oscar.arabfati.data.model.WordModel

@Database(entities = arrayOf(WordModel::class,CategoryModel::class), version = 1)
abstract class WordsDatabase :RoomDatabase() {
    abstract fun wordsDao(): WordsDao
    abstract fun categoriesDao(): CategoriesDao
    companion object {
        fun getDBInstance(context: Context): WordsDatabase {
            val db = Room.databaseBuilder(
                context,
                WordsDatabase::class.java, "words-database"
            ).build()
            return db
        }
    }
}