package com.oscar.arabfati.data.repository

import com.oscar.arabfati.core.functional.State
import com.oscar.arabfati.data.datasource.DataSource
import com.oscar.arabfati.data.model.CategoryModel
import com.oscar.arabfati.data.model.WordModel
import javax.inject.Inject

class RepositoryImp@Inject constructor(
private val dataSource: DataSource
):Repository{
    override fun getWords() = dataSource.getWords()

    override fun getWordsByCategory(category: String) = dataSource.getWordsByCategory(category)

    override fun insertWord(word: WordModel) = dataSource.insertWord(word)

    override fun updateWord(word: WordModel) = dataSource.updateWord(word)

    override fun deleteWord(word: WordModel) = dataSource.deleteWord(word)

    override fun getCategories() = dataSource.getCategories()

    override fun insertCategory(category: CategoryModel) = dataSource.insertCategory(category)

    override fun updateCategory(category: CategoryModel) = dataSource.updateCategory(category)

    override fun deleteCategory(category: CategoryModel) = dataSource.deleteCategory(category)
}