package com.example.taskmanagerapp.data.models

import android.widget.DatePicker
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.taskmanagerapp.utils.Constants.DATABASE_TABLE_NAME

@Entity(tableName = DATABASE_TABLE_NAME)
data class TaskEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val priority: Priority,
    val date: String
)
