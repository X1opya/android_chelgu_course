package com.example.test.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.test.models.Pony

@Dao
interface PonyDao {
    @Insert
    fun insert(pony: Pony)

    @Query("SELECT * FROM pony")
    fun getPonies() : List<Pony>
}