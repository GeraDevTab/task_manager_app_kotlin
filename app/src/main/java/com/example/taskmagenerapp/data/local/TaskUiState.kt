package com.example.taskmagenerapp.data.local

data class TaskUiState(
    val tasks: List<Task> = emptyList(),
    val isLoading: Boolean = false
)
