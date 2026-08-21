package com.example.taskmagenerapp.ui.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.taskmagenerapp.viewmodel.TaskViewModel
import kotlin.collections.emptyList

@Composable
fun TaskScreen(viewModel: TaskViewModel) {
    val tasks by viewModel. .tasks.collectAsState(
        initial = emptyList()
    )
    LazyColumn {
        items(tasks) {
            task -> Text(task.title)
        }
    }
}