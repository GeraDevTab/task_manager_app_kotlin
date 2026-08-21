package com.example.taskmagenerapp.data.repository

import com.example.taskmagenerapp.data.local.Task
import com.example.taskmagenerapp.data.local.TaskDao

class TaskRepository(
    private val taskDao: TaskDao
) {
    fun getTasks() =
        taskDao.getTasks()

    suspend fun addTask(task: Task) {
        taskDao.insertTask(task)
    }
}