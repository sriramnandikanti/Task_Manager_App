package com.example.taskmanagerapp.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.taskmanagerapp.ui.screens.splash.SplashScreen
import com.example.taskmanagerapp.utils.Constants.SPLASH_SCREEN

fun NavGraphBuilder.splashComposable(
    navigateToListScreen : () -> Unit
) {
    composable(
        route = SPLASH_SCREEN
    ) {
        SplashScreen(navigateToListScreen)
    }
}