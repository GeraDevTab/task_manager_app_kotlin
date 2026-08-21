package com.example.taskmagenerapp.ui.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun TaskListScreen() {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {  }
            ) {
                Icon(
                    Icons.Default.Add,
                    contentDescription = "Add Task"
                )
            }
        }
    ) { padding ->
        TaskList(
            modifier = Modifier.padding(padding)
        )
    }
}

@Composable
fun TaskList(
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier
    ) {
        items(tasks) { task ->
            TaskItem(task)
        }
    }
}