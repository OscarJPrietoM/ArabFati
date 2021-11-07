package com.oscar.arabfati.data.repository

import com.oscar.arabfati.core.functional.State
import com.oscar.arabfati.data.model.CategoryModel
import com.oscar.arabfati.data.model.WordModel
import kotlinx.coroutines.flow.Flow

interface Repository {
    fun getWords(): Flow<State<List<WordModel>>>
    fun getWordsByCategory(category:String): Flow<State<List<WordModel>>>

    fun insertWord(word:WordModel)
    fun updateWord(word:WordModel)
    fun deleteWord(word:WordModel)

    fun getCategories(): Flow<State<List<CategoryModel>>>

    fun insertCategory(category: CategoryModel)
    fun updateCategory(category: CategoryModel)
    fun deleteCategory(category: CategoryModel)
}