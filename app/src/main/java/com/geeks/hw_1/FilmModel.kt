package com.geeks.hw_1

import java.io.Serializable

data class FilmModel(
    val img: String,
    val name: String,
    val rate: String
): Serializable
