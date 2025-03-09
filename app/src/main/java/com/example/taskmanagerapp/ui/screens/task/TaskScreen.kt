package com.example.taskmanagerapp.ui.screens.task

import android.annotation.SuppressLint
import android.content.Context
import android.widget.Toast
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.LocalContext
import com.example.taskmanagerapp.data.models.Priority
import com.example.taskmanagerapp.data.models.TaskEntity
import com.example.taskmanagerapp.ui.viewmodels.SharedViewmodel
import com.example.taskmanagerapp.utils.Actions
import androidx.activity.compose.BackHandler

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun TaskScreen(
    selectedTask: TaskEntity?,
    sharedViewModel: SharedViewmodel,
    navigateToListScreen: (Actions) -> Unit
) {

//    BackHandler(onBackPressed = {
//        navigateToListScreen(Actions.NO_ACTION)
//    })
    BackHandler {
        navigateToListScreen(Actions.NO_ACTION)
    }
    val title: String by sharedViewModel.title
    val description: String by sharedViewModel.description
    val priority: Priority by sharedViewModel.priority

    val context = LocalContext.current

    Scaffold(
        topBar = {
            TaskAppBar(
                selectedTask = selectedTask,
                navigateToListScreen = { action ->
                    if (action == Actions.NO_ACTION) {
                        navigateToListScreen(action)
                    } else {
                        if (sharedViewModel.validateFields()) {
                            navigateToListScreen(action)
                        } else {
                            displayToast(context = context)
                        }
                    }
                }
            )
        },
        content = {
            TaskContent(
                title = title,
                onTitleChange = {
                    sharedViewModel.title.value = it
                },
                description = description,
                onDescriptionChange = {
                    sharedViewModel.description.value = it
                },
                priority = priority,
                onPriorityChange = {
                    sharedViewModel.priority.value = it
                }
            )
        }
    )
}

fun displayToast(context : Context) {
    Toast.makeText(context,"Title cannot be empty.",Toast.LENGTH_SHORT).show()
}

//@Composable
//fun BackHandler(
//    backDispatcher : OnBackPressedDispatcher ? =
//        LocalOnBackPressedDispatcherOwner.current?.onBackPressedDispatcher,
//    onBackPressed : () -> Unit
//){
//    val currentOnBackPressed by rememberUpdatedState(newValue = onBackPressed)
//
//    val backCallBack = remember {
//        object : OnBackPressedCallback(true) {
//            override fun handleOnBackPressed() {
//                currentOnBackPressed()
//            }
//        }
//    }
//
//    // disposable is used when we want to dispose something when we the key changes or we leave the composable
//    DisposableEffect(key1 = backDispatcher){
//        backDispatcher?.addCallback(backCallBack)
//        onDispose {
//            backCallBack.remove()
//        }
//    }
//
//}