package com.oscar.arabfati.data.datasource

import com.oscar.arabfati.core.functional.State
import com.oscar.arabfati.data.model.CategoryModel
import com.oscar.arabfati.data.model.WordModel
import kotlinx.coroutines.flow.Flow

interface DataSource {
    fun getWords(): Flow<State<List<WordModel>>>
    fun getWordsByCategory(category: String): Flow<State<List<WordModel>>>
    fun getCategories(): Flow<State<List<CategoryModel>>>

    fun insertWord(word:WordModel)
    fun updateWord(word:WordModel)
    fun deleteWord(word:WordModel)

    fun insertCategory(category: CategoryModel)
    fun updateCategory(category: CategoryModel)
    fun deleteCategory(category: CategoryModel)
}