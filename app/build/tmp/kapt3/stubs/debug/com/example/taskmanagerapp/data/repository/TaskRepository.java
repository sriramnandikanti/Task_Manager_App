package com.example.taskmanagerapp.data.repository;

import java.lang.System;

@dagger.hilt.android.scopes.ViewModelScoped
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0011\u0010\u0013\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0017\u001a\u00020\u0018J\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u001a\u001a\u00020\u001bJ\u0019\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lcom/example/taskmanagerapp/data/repository/TaskRepository;", "", "taskDao", "Lcom/example/taskmanagerapp/data/TaskDao;", "(Lcom/example/taskmanagerapp/data/TaskDao;)V", "getAllTasks", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/taskmanagerapp/data/models/TaskEntity;", "getGetAllTasks", "()Lkotlinx/coroutines/flow/Flow;", "sortByHighPriority", "getSortByHighPriority", "sortByLowPriority", "getSortByLowPriority", "addTask", "", "taskEntity", "(Lcom/example/taskmanagerapp/data/models/TaskEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllTasks", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTask", "getSelectedTask", "taskId", "", "searchDatabase", "searchQuery", "", "updateTask", "app_debug"})
public final class TaskRepository {
    private final com.example.taskmanagerapp.data.TaskDao taskDao = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.example.taskmanagerapp.data.models.TaskEntity>> getAllTasks = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.example.taskmanagerapp.data.models.TaskEntity>> sortByLowPriority = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.example.taskmanagerapp.data.models.TaskEntity>> sortByHighPriority = null;
    
    @javax.inject.Inject
    public TaskRepository(@org.jetbrains.annotations.NotNull
    com.example.taskmanagerapp.data.TaskDao taskDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.taskmanagerapp.data.models.TaskEntity>> getGetAllTasks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.taskmanagerapp.data.models.TaskEntity>> getSortByLowPriority() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.taskmanagerapp.data.models.TaskEntity>> getSortByHighPriority() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.example.taskmanagerapp.data.models.TaskEntity> getSelectedTask(int taskId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object addTask(@org.jetbrains.annotations.NotNull
    com.example.taskmanagerapp.data.models.TaskEntity taskEntity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteTask(@org.jetbrains.annotations.NotNull
    com.example.taskmanagerapp.data.models.TaskEntity taskEntity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object updateTask(@org.jetbrains.annotations.NotNull
    com.example.taskmanagerapp.data.models.TaskEntity taskEntity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteAllTasks(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.taskmanagerapp.data.models.TaskEntity>> searchDatabase(@org.jetbrains.annotations.NotNull
    java.lang.String searchQuery) {
        return null;
    }
}