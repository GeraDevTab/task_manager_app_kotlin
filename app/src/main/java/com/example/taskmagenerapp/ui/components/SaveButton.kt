package com.example.taskmagenerapp.ui.components

import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun SaveButton(
    isLoading: Boolean,
    onClick: ()-> Unit
) {
    Button(
        onClick = onClick,
        enabled = !isLoading
    ) {
        if(isLoading) {
            CircularProgressIndicator()
        } else {
            Text("Save")
        }
    }
}