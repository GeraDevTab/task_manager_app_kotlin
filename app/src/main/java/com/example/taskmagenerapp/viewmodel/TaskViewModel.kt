package com.example.taskmagenerapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.taskmagenerapp.data.local.Task
import com.example.taskmagenerapp.data.repository.TaskRepository
import kotlinx.coroutines.launch

class TaskViewModel(private val repository: TaskRepository): ViewModel() {
    fun saveTask(task: Task){
        viewModelScope.launch {
            repository.addTask(task)
        }
    }
}