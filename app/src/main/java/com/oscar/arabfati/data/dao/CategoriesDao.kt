package com.oscar.arabfati.data.dao

import androidx.room.*
import com.oscar.arabfati.data.model.CategoryModel

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