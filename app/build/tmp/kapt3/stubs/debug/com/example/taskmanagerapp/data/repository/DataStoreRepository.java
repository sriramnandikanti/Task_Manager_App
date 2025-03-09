package com.example.taskmanagerapp.data.repository;

import java.lang.System;

@dagger.hilt.android.scopes.ViewModelScoped
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/example/taskmanagerapp/data/repository/DataStoreRepository;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "readSortState", "Lkotlinx/coroutines/flow/Flow;", "", "getReadSortState", "()Lkotlinx/coroutines/flow/Flow;", "persistSortState", "", "priority", "Lcom/example/taskmanagerapp/data/models/Priority;", "(Lcom/example/taskmanagerapp/data/models/Priority;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PreferenceKeys", "app_debug"})
public final class DataStoreRepository {
    private final android.content.Context context = null;
    private final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataStore = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.lang.String> readSortState = null;
    
    @javax.inject.Inject
    public DataStoreRepository(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object persistSortState(@org.jetbrains.annotations.NotNull
    com.example.taskmanagerapp.data.models.Priority priority, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.String> getReadSortState() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c2\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/taskmanagerapp/data/repository/DataStoreRepository$PreferenceKeys;", "", "()V", "sortKey", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "getSortKey", "()Landroidx/datastore/preferences/core/Preferences$Key;", "app_debug"})
    static final class PreferenceKeys {
        @org.jetbrains.annotations.NotNull
        public static final com.example.taskmanagerapp.data.repository.DataStoreRepository.PreferenceKeys INSTANCE = null;
        @org.jetbrains.annotations.NotNull
        private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> sortKey = null;
        
        private PreferenceKeys() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> getSortKey() {
            return null;
        }
    }
}