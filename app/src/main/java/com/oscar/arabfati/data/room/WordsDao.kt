package com.oscar.arabfati.data.room

import androidx.room.*
import com.oscar.arabfati.data.model.WordModel

@Dao
interface WordsDao {
    @Query("SELECT * FROM Words")
    fun getAll(): List<WordModel>

    @Query("SELECT * FROM Words WHERE category LIKE :category")
    fun getAllByCategory(category: String): List<WordModel>

    @Insert
    fun insert(word:WordModel)

    @Update
    fun update(word:WordModel)

    @Delete
    fun delete(word:WordModel)
}