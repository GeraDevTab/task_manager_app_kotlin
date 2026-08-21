package com.example.taskmagenerapp.data.local

import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDao {
    @Query("SELECT * FROM tasks")
    fun getTasks(): Flow<List<Task>>

    @Insert
    suspend fun insertTask(
        task: Task
    )
}