package com.example.taskmanagerapp.data.models

import androidx.compose.ui.graphics.Color
import com.example.taskmanagerapp.ui.theme.HighPriorityColor
import com.example.taskmanagerapp.ui.theme.LowPriorityColor
import com.example.taskmanagerapp.ui.theme.MediumPriorityColor
import com.example.taskmanagerapp.ui.theme.NonePriorityColor

enum class Priority(val color : Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}