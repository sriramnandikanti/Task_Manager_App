package com.example.taskmanagerapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.taskmanagerapp.navigation.destinations.listComposable
import com.example.taskmanagerapp.navigation.destinations.splashComposable
import com.example.taskmanagerapp.navigation.destinations.taskComposable
import com.example.taskmanagerapp.ui.viewmodels.SharedViewmodel
import com.example.taskmanagerapp.utils.Constants.SPLASH_SCREEN
import com.example.taskmanagerapp.navigation.Screens

@Composable
fun SetupNavigation(
    navController: NavHostController,
    sharedViewmodel: SharedViewmodel
) {
    val screen = remember(navController) {
        Screens(navController = navController)
    }

    NavHost(
        navController = navController,
        startDestination = SPLASH_SCREEN
    ) {
        splashComposable(
            navigateToListScreen = screen.splash
        )

        listComposable(
            navigateToTaskScreen = screen.task,
            sharedViewmodel
        )
        taskComposable(
            navigateToListScreen = screen.list,
            sharedViewmodel = sharedViewmodel
        )
    }
}