package com.example.taskmanagerapp.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u00020\t\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0086T\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b!\u00a8\u0006\u0016"}, d2 = {"Lcom/example/taskmanagerapp/utils/Constants;", "", "()V", "DATABASE_NAME", "", "DATABASE_TABLE_NAME", "LIST_ARGUMENT_KEY", "LIST_SCREEN", "LOGO_HEIGHT", "Landroidx/compose/ui/unit/Dp;", "getLOGO_HEIGHT-D9Ej5fM", "()F", "F", "PREFERENCE_KEY", "PREFERENCE_NAME", "SPLASH_SCREEN", "SPLASH_SCREEN_DELAY", "", "TASK_ARGUMENT_KEY", "TASK_SCREEN", "TITLE_CHAR_LIMIT", "", "app_debug"})
public final class Constants {
    @org.jetbrains.annotations.NotNull
    public static final com.example.taskmanagerapp.utils.Constants INSTANCE = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DATABASE_TABLE_NAME = "task_table";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DATABASE_NAME = "task_db";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String LIST_SCREEN = "list/{action}";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TASK_SCREEN = "task/{taskId}";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SPLASH_SCREEN = "splash";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String LIST_ARGUMENT_KEY = "action";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TASK_ARGUMENT_KEY = "taskId";
    public static final int TITLE_CHAR_LIMIT = 35;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PREFERENCE_NAME = "todo_preferences";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PREFERENCE_KEY = "sort_state";
    private static final float LOGO_HEIGHT = 0.0F;
    public static final long SPLASH_SCREEN_DELAY = 2000L;
    
    private Constants() {
        super();
    }
}