package com.example.taskmanagerapp.navigation.destinations

import android.util.Log
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.taskmanagerapp.ui.screens.list.ListScreen
import com.example.taskmanagerapp.ui.viewmodels.SharedViewmodel
import com.example.taskmanagerapp.utils.Actions
import com.example.taskmanagerapp.utils.Constants.LIST_ARGUMENT_KEY
import com.example.taskmanagerapp.utils.Constants.LIST_SCREEN
import com.example.taskmanagerapp.utils.toAction

// we cant use composable here, cause it is defined inside navhost
// so we need to create a extension function

fun NavGraphBuilder.listComposable(
    navigateToTaskScreen: (taskId: Int) -> Unit,
    sharedViewModel: SharedViewmodel
) {
    composable(
        route = LIST_SCREEN,
        arguments = listOf(
            navArgument(
                LIST_ARGUMENT_KEY
            ) {
                type = NavType.StringType
            })
    ) { navBackStackEntry ->
        val action = navBackStackEntry.arguments?.getString(LIST_ARGUMENT_KEY).toAction()

        var myAction by rememberSaveable {
            mutableStateOf(Actions.NO_ACTION)
        }
        LaunchedEffect(key1 = myAction) {
//            Log.d("ListComposable",action.toString())
            if (action != myAction) {
                myAction = action
                sharedViewModel.action.value = action
            }
        }
        ListScreen(navigateToTaskScreen = navigateToTaskScreen, sharedViewmodel = sharedViewModel)
    }
}