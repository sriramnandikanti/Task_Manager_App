package com.example.taskmanagerapp.ui.screens.list;

import java.lang.System;

@kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\u001aS\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\tH\u0007\u001a\u009f\u0001\u0010\u000e\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00102\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00102\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u0016\u001a\u00020\u0017H\u0007\u001a\u0010\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u001aH\u0007\u001a\b\u0010\u001b\u001a\u00020\u0001H\u0003\u001a3\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u00042!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\tH\u0007\u001a\b\u0010\u001e\u001a\u00020\u0001H\u0007\u00a8\u0006\u001f"}, d2 = {"HandleListContent", "", "tasks", "", "Lcom/example/taskmanagerapp/data/models/TaskEntity;", "onSwipeToDelete", "Lkotlin/Function2;", "Lcom/example/taskmanagerapp/utils/Actions;", "navigateToTaskScreen", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "taskId", "ListContent", "allTasks", "Lcom/example/taskmanagerapp/utils/RequestState;", "lowPriorityTasks", "highPriorityTasks", "sortState", "Lcom/example/taskmanagerapp/data/models/Priority;", "searchedTasks", "searchAppBarState", "Lcom/example/taskmanagerapp/utils/SearchAppBarState;", "RedBackground", "degrees", "", "RedBackgroundPreview", "TaskItem", "task", "TaskItemPreview", "app_debug"})
public final class ListContentKt {
    
    @androidx.compose.runtime.Composable
    public static final void ListContent(@org.jetbrains.annotations.NotNull
    com.example.taskmanagerapp.utils.RequestState<? extends java.util.List<com.example.taskmanagerapp.data.models.TaskEntity>> allTasks, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.taskmanagerapp.data.models.TaskEntity> lowPriorityTasks, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.taskmanagerapp.data.models.TaskEntity> highPriorityTasks, @org.jetbrains.annotations.NotNull
    com.example.taskmanagerapp.utils.RequestState<? extends com.example.taskmanagerapp.data.models.Priority> sortState, @org.jetbrains.annotations.NotNull
    com.example.taskmanagerapp.utils.RequestState<? extends java.util.List<com.example.taskmanagerapp.data.models.TaskEntity>> searchedTasks, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super com.example.taskmanagerapp.utils.Actions, ? super com.example.taskmanagerapp.data.models.TaskEntity, kotlin.Unit> onSwipeToDelete, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> navigateToTaskScreen, @org.jetbrains.annotations.NotNull
    com.example.taskmanagerapp.utils.SearchAppBarState searchAppBarState) {
    }
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @android.annotation.SuppressLint(value = {"CoroutineCreationDuringComposition"})
    public static final void HandleListContent(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.taskmanagerapp.data.models.TaskEntity> tasks, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super com.example.taskmanagerapp.utils.Actions, ? super com.example.taskmanagerapp.data.models.TaskEntity, kotlin.Unit> onSwipeToDelete, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> navigateToTaskScreen) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void RedBackground(float degrees) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void TaskItem(@org.jetbrains.annotations.NotNull
    com.example.taskmanagerapp.data.models.TaskEntity task, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> navigateToTaskScreen) {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview
    public static final void TaskItemPreview() {
    }
    
    @androidx.compose.ui.tooling.preview.Preview
    @androidx.compose.runtime.Composable
    private static final void RedBackgroundPreview() {
    }
}