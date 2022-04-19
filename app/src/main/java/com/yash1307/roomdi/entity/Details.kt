package com.yash1307.roomdi.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "details")
data class Details(
    val name: String,
    @PrimaryKey(autoGenerate = false)
    val id: Int
)
