package com.oscar.arabfati.data.room

import androidx.room.*
import com.oscar.arabfati.data.model.CategoryModel
import com.oscar.arabfati.data.model.WordModel

@Dao
interface CategoriesDao {
    @Query("SELECT * FROM Categories")
    fun getAll(): List<CategoryModel>

    @Insert
    fun insert(category: CategoryModel)

    @Update
    fun update(category: CategoryModel)

    @Delete
    fun delete(category: CategoryModel)
}