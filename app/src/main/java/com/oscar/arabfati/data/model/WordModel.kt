package com.oscar.arabfati.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "Words", foreignKeys = arrayOf(
    ForeignKey(entity = CategoryModel::class,
    parentColumns = arrayOf("name"),
    childColumns = arrayOf("category"),
    onDelete = ForeignKey.CASCADE)
))
data class WordModel(
    @PrimaryKey (autoGenerate = true)
    val wordId: Int,

    @ColumnInfo
    val esp:String,

    @ColumnInfo
    val arab:String,

    @ColumnInfo
    val category:String
    )
