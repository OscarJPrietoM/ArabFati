package com.oscar.arabfati.core.functional

sealed class State<out T : Any>

class Success<out T : Any>(val data: T) : State<T>()
class Error<T>(message: String, data: T? = null) : State<Nothing>()
class Loading<T : Any>(data: T? = null) : State<T>()

