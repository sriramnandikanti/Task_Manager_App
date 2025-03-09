package com.example.taskmanagerapp.ui.screens.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001aB\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u000b\u001a\u00020\nH\u0007\u001a+\u0010\f\u001a\u00020\u00012!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00010\tH\u0007\u001a3\u0010\u0012\u001a\u00020\u00012!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007\u001a\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002\u001a\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a,\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\tH\u0002\u00a8\u0006\u001b"}, d2 = {"DisplaySnackBar", "", "snackbarHostState", "Landroidx/compose/material3/SnackbarHostState;", "handleDatabaseActions", "Lkotlin/Function0;", "taskTitle", "", "onUndoClicked", "Lkotlin/Function1;", "Lcom/example/taskmanagerapp/utils/Actions;", "action", "ListFab", "onFabClicked", "", "Lkotlin/ParameterName;", "name", "taskId", "ListScreen", "navigateToTaskScreen", "sharedViewmodel", "Lcom/example/taskmanagerapp/ui/viewmodels/SharedViewmodel;", "setActionLabel", "setMessage", "undoDeletedTask", "snackbarResult", "Landroidx/compose/material3/SnackbarResult;", "app_debug"})
public final class ListScreenKt {
    
    @androidx.compose.runtime.Composable
    @android.annotation.SuppressLint(value = {"UnusedMaterial3ScaffoldPaddingParameter"})
    public static final void ListScreen(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> navigateToTaskScreen, @org.jetbrains.annotations.NotNull
    com.example.taskmanagerapp.ui.viewmodels.SharedViewmodel sharedViewmodel) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ListFab(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onFabClicked) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void DisplaySnackBar(@org.jetbrains.annotations.NotNull
    androidx.compose.material3.SnackbarHostState snackbarHostState, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> handleDatabaseActions, @org.jetbrains.annotations.NotNull
    java.lang.String taskTitle, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.example.taskmanagerapp.utils.Actions, kotlin.Unit> onUndoClicked, @org.jetbrains.annotations.NotNull
    com.example.taskmanagerapp.utils.Actions action) {
    }
    
    private static final java.lang.String setActionLabel(com.example.taskmanagerapp.utils.Actions action) {
        return null;
    }
    
    private static final java.lang.String setMessage(com.example.taskmanagerapp.utils.Actions action, java.lang.String taskTitle) {
        return null;
    }
    
    private static final void undoDeletedTask(com.example.taskmanagerapp.utils.Actions action, androidx.compose.material3.SnackbarResult snackbarResult, kotlin.jvm.functions.Function1<? super com.example.taskmanagerapp.utils.Actions, kotlin.Unit> onUndoClicked) {
    }
}