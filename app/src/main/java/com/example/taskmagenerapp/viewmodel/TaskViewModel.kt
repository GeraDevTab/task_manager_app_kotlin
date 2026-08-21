package com.example.taskmagenerapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.taskmagenerapp.data.local.Task
import com.example.taskmagenerapp.data.local.TaskUiState
import com.example.taskmagenerapp.data.repository.TaskRepository
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class TaskViewModel(private val repository: TaskRepository): ViewModel() {
    val uiState = repository.getTasks()
        .map { tasks ->
            TaskUiState(tasks = tasks)
        }
        .stateIn(
            viewModelScope,
            SharingStarted.WhileSubscribed(5000),
            TaskUiState()
        )



    fun saveTask(task: Task){
        viewModelScope.launch {
            repository.addTask(task)
        }
    }

    fun addTask(task: Task) {
        viewModelScope.launch {
            repository.addTask(task)
        }
    }
}