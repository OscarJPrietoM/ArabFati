package com.oscar.arabfati.data.datasource

import com.oscar.arabfati.core.functional.State
import com.oscar.arabfati.core.functional.Success
import com.oscar.arabfati.data.model.CategoryModel
import com.oscar.arabfati.data.model.WordModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class DataSourceImp: DataSource {
    override fun getWords() = flow {
        emit(Success(wordsDao.getAll()))
    }

    override fun getWordsByCategory(category: String): Flow<State<List<WordModel>>> {
        TODO("Not yet implemented")
    }

    override fun getCategories(): Flow<State<List<CategoryModel>>> {
        TODO("Not yet implemented")
    }

    override fun insertWord(word: WordModel) {
        TODO("Not yet implemented")
    }

    override fun updateWord(word: WordModel) {
        TODO("Not yet implemented")
    }

    override fun deleteWord(word: WordModel) {
        TODO("Not yet implemented")
    }

    override fun insertCategory(category: CategoryModel) {
        TODO("Not yet implemented")
    }

    override fun updateCategory(category: CategoryModel) {
        TODO("Not yet implemented")
    }

    override fun deleteCategory(category: CategoryModel) {
        TODO("Not yet implemented")
    }

}