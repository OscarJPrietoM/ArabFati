package com.oscar.arabfati.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "Categories")
data class CategoryModel(
    @PrimaryKey
    val name:String
    )
