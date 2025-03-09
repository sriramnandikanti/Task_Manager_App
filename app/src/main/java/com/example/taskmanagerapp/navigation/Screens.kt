package com.example.taskmanagerapp.navigation

import androidx.navigation.NavHostController
import com.example.taskmanagerapp.utils.Actions
import com.example.taskmanagerapp.utils.Constants.LIST_SCREEN
import com.example.taskmanagerapp.utils.Constants.SPLASH_SCREEN

class Screens(navController: NavHostController) {
    val splash: () -> Unit = {
        navController.navigate(route = "list/${Actions.NO_ACTION.name}") {
            popUpTo(SPLASH_SCREEN) { inclusive = true }
        }
    }
    val list: (Actions) -> Unit = { action ->
        navController.navigate("list/${action.name}") {
            popUpTo(LIST_SCREEN) { inclusive = true }
        }
    }

    val task: (Int) -> Unit = { taskId ->
        navController.navigate("task/$taskId")
    }

}