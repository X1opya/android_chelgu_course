package com.example.retrofit_example

import com.google.gson.annotations.SerializedName

data class Film(
    val title: String,
    val id: String,
    @SerializedName("original_title") val originalTitle: String
)