package com.example.taskmanagerapp.ui.screens.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a8\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007\u001a\b\u0010\b\u001a\u00020\u0001H\u0007\u001a \u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007\u001a8\u0010\u0010\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007\u001a\u0016\u0010\u0011\u001a\u00020\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007\u001aF\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\r2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a\b\u0010\u0017\u001a\u00020\u0001H\u0007\u001a\u0016\u0010\u0018\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007\u001a\u001c\u0010\u0019\u001a\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u00a8\u0006\u001a"}, d2 = {"DefaultListAppBar", "", "onSearchClicked", "Lkotlin/Function0;", "onSortClicked", "Lkotlin/Function1;", "Lcom/example/taskmanagerapp/data/models/Priority;", "onDeleteAllConfirmed", "DefaultListAppBarPreview", "ListAppBar", "searchAppBarState", "Lcom/example/taskmanagerapp/utils/SearchAppBarState;", "searchTextState", "", "viewmodel", "Lcom/example/taskmanagerapp/ui/viewmodels/SharedViewmodel;", "ListAppBarActions", "OnDeleteAllConfirm", "onDeleteAllClicked", "SearchAppBar", "text", "onTextChanged", "onCloseClicked", "SearchAppBarPreview", "SearchTasks", "SortAction", "app_debug"})
public final class ListAppBarKt {
    
    @androidx.compose.runtime.Composable
    public static final void ListAppBar(@org.jetbrains.annotations.NotNull
    com.example.taskmanagerapp.utils.SearchAppBarState searchAppBarState, @org.jetbrains.annotations.NotNull
    java.lang.String searchTextState, @org.jetbrains.annotations.NotNull
    com.example.taskmanagerapp.ui.viewmodels.SharedViewmodel viewmodel) {
    }
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    public static final void DefaultListAppBar(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onSearchClicked, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.example.taskmanagerapp.data.models.Priority, kotlin.Unit> onSortClicked, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onDeleteAllConfirmed) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ListAppBarActions(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onSearchClicked, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.example.taskmanagerapp.data.models.Priority, kotlin.Unit> onSortClicked, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onDeleteAllConfirmed) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void SearchTasks(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onSearchClicked) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void SortAction(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.example.taskmanagerapp.data.models.Priority, kotlin.Unit> onSortClicked) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void OnDeleteAllConfirm(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onDeleteAllClicked) {
    }
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    public static final void SearchAppBar(@org.jetbrains.annotations.NotNull
    java.lang.String text, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onTextChanged, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onCloseClicked, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onSearchClicked) {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview
    public static final void DefaultListAppBarPreview() {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview
    public static final void SearchAppBarPreview() {
    }
}