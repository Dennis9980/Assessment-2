package org.d3if0119.pomodoroappnew.db

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "tasks")
data class TaskEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val name: String
)
