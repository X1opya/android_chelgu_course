package com.example.test.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "pony")
data class Pony(
    @ColumnInfo(name = "color") val color: Int,
    @ColumnInfo(name = "tailLength") val tailLength: Int,
    @ColumnInfo(name = "sex") val sex: String
) {
    @PrimaryKey(autoGenerate = true) var id: Int = 0
}