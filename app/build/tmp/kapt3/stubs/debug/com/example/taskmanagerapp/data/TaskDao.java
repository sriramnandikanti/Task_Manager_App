package com.example.taskmanagerapp.data;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000bH\'J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\'J\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\'J\u0014\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000bH\'J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000bH\'J\u0019\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/example/taskmanagerapp/data/TaskDao;", "", "addTask", "", "taskEntity", "Lcom/example/taskmanagerapp/data/models/TaskEntity;", "(Lcom/example/taskmanagerapp/data/models/TaskEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllTasks", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTask", "getAllTasks", "Lkotlinx/coroutines/flow/Flow;", "", "getSelectedTask", "taskId", "", "searchDatabase", "searchQuery", "", "sortByHighPriority", "sortByLowPriority", "updateTask", "app_debug"})
public abstract interface TaskDao {
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM task_table ORDER BY id ASC")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.taskmanagerapp.data.models.TaskEntity>> getAllTasks();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM task_table WHERE id = :taskId")
    public abstract kotlinx.coroutines.flow.Flow<com.example.taskmanagerapp.data.models.TaskEntity> getSelectedTask(int taskId);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 5)
    public abstract java.lang.Object addTask(@org.jetbrains.annotations.NotNull
    com.example.taskmanagerapp.data.models.TaskEntity taskEntity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Update
    public abstract java.lang.Object updateTask(@org.jetbrains.annotations.NotNull
    com.example.taskmanagerapp.data.models.TaskEntity taskEntity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Delete
    public abstract java.lang.Object deleteTask(@org.jetbrains.annotations.NotNull
    com.example.taskmanagerapp.data.models.TaskEntity taskEntity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "DELETE FROM task_table")
    public abstract java.lang.Object deleteAllTasks(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM task_table \n        WHERE title LIKE :searchQuery \n        OR description LIKE :searchQuery")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.taskmanagerapp.data.models.TaskEntity>> searchDatabase(@org.jetbrains.annotations.NotNull
    java.lang.String searchQuery);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM task_table \n        ORDER BY CASE \n        WHEN priority LIKE \'L%\' THEN 1 \n        WHEN priority LIKE \'M%\' THEN 2 \n        WHEN priority LIKE \'H%\' THEN 3 END")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.taskmanagerapp.data.models.TaskEntity>> sortByLowPriority();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM task_table \n        ORDER BY CASE \n        WHEN priority LIKE \'H%\' THEN 1 \n        WHEN priority LIKE \'M%\' THEN 2 \n        WHEN priority LIKE \'L%\' THEN 3 END")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.taskmanagerapp.data.models.TaskEntity>> sortByHighPriority();
}