package com.example.taskmanagerapp.ui.viewmodels;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u000205H\u0002J\b\u00107\u001a\u000205H\u0002J\u0006\u0010\u0017\u001a\u000205J\u000e\u0010/\u001a\u0002052\u0006\u00108\u001a\u00020!J\u000e\u00109\u001a\u0002052\u0006\u0010\u0010\u001a\u00020\u0012J\u000e\u0010:\u001a\u0002052\u0006\u0010%\u001a\u00020\u000fJ\u0006\u0010;\u001a\u000205J\u000e\u0010<\u001a\u0002052\u0006\u0010=\u001a\u00020\u001aJ\b\u0010>\u001a\u000205H\u0002J\u0010\u0010?\u001a\u0002052\b\u0010.\u001a\u0004\u0018\u00010\u000bJ\u0006\u0010@\u001a\u00020AR \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R#\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u001d\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014R\u001d\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\'\u001a\b\u0012\u0004\u0012\u00020(0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0014R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0014R#\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0018R\u0019\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0018R\u001d\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t0\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0018R\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0014\u00a8\u0006B"}, d2 = {"Lcom/example/taskmanagerapp/ui/viewmodels/SharedViewmodel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/taskmanagerapp/data/repository/TaskRepository;", "dataStoreRepository", "Lcom/example/taskmanagerapp/data/repository/DataStoreRepository;", "(Lcom/example/taskmanagerapp/data/repository/TaskRepository;Lcom/example/taskmanagerapp/data/repository/DataStoreRepository;)V", "_allTasks", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/taskmanagerapp/utils/RequestState;", "", "Lcom/example/taskmanagerapp/data/models/TaskEntity;", "_searchedTasks", "_selectedTask", "_sortState", "Lcom/example/taskmanagerapp/data/models/Priority;", "action", "Landroidx/compose/runtime/MutableState;", "Lcom/example/taskmanagerapp/utils/Actions;", "getAction", "()Landroidx/compose/runtime/MutableState;", "allTasks", "Lkotlinx/coroutines/flow/StateFlow;", "getAllTasks", "()Lkotlinx/coroutines/flow/StateFlow;", "date", "", "getDate", "description", "getDescription", "highPriorityTasks", "getHighPriorityTasks", "id", "", "getId", "lowPriorityTasks", "getLowPriorityTasks", "priority", "getPriority", "searchAppBarState", "Lcom/example/taskmanagerapp/utils/SearchAppBarState;", "getSearchAppBarState", "searchTextState", "getSearchTextState", "searchedTasks", "getSearchedTasks", "selectedTask", "getSelectedTask", "sortState", "getSortState", "title", "getTitle", "addTask", "", "deleteAllTasks", "deleteTask", "taskId", "handleDatabaseActions", "persistSortState", "readSortState", "searchDatabase", "searchQuery", "updateTask", "updateTaskFields", "validateFields", "", "app_debug"})
public final class SharedViewmodel extends androidx.lifecycle.ViewModel {
    private final com.example.taskmanagerapp.data.repository.TaskRepository repository = null;
    private final com.example.taskmanagerapp.data.repository.DataStoreRepository dataStoreRepository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<com.example.taskmanagerapp.utils.Actions> action = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.Integer> id = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.String> title = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.String> description = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<com.example.taskmanagerapp.data.models.Priority> priority = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.String> date = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<com.example.taskmanagerapp.utils.SearchAppBarState> searchAppBarState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.String> searchTextState = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.taskmanagerapp.utils.RequestState<java.util.List<com.example.taskmanagerapp.data.models.TaskEntity>>> _searchedTasks = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.example.taskmanagerapp.utils.RequestState<java.util.List<com.example.taskmanagerapp.data.models.TaskEntity>>> searchedTasks = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.taskmanagerapp.data.models.TaskEntity>> lowPriorityTasks = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.taskmanagerapp.data.models.TaskEntity>> highPriorityTasks = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.taskmanagerapp.utils.RequestState<com.example.taskmanagerapp.data.models.Priority>> _sortState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.example.taskmanagerapp.utils.RequestState<com.example.taskmanagerapp.data.models.Priority>> sortState = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.taskmanagerapp.utils.RequestState<java.util.List<com.example.taskmanagerapp.data.models.TaskEntity>>> _allTasks = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.example.taskmanagerapp.utils.RequestState<java.util.List<com.example.taskmanagerapp.data.models.TaskEntity>>> allTasks = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.taskmanagerapp.data.models.TaskEntity> _selectedTask = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.example.taskmanagerapp.data.models.TaskEntity> selectedTask = null;
    
    @javax.inject.Inject
    public SharedViewmodel(@org.jetbrains.annotations.NotNull
    com.example.taskmanagerapp.data.repository.TaskRepository repository, @org.jetbrains.annotations.NotNull
    com.example.taskmanagerapp.data.repository.DataStoreRepository dataStoreRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<com.example.taskmanagerapp.utils.Actions> getAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.Integer> getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.String> getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.String> getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<com.example.taskmanagerapp.data.models.Priority> getPriority() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.String> getDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<com.example.taskmanagerapp.utils.SearchAppBarState> getSearchAppBarState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.String> getSearchTextState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.example.taskmanagerapp.utils.RequestState<java.util.List<com.example.taskmanagerapp.data.models.TaskEntity>>> getSearchedTasks() {
        return null;
    }
    
    public final void searchDatabase(@org.jetbrains.annotations.NotNull
    java.lang.String searchQuery) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.taskmanagerapp.data.models.TaskEntity>> getLowPriorityTasks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.taskmanagerapp.data.models.TaskEntity>> getHighPriorityTasks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.example.taskmanagerapp.utils.RequestState<com.example.taskmanagerapp.data.models.Priority>> getSortState() {
        return null;
    }
    
    public final void readSortState() {
    }
    
    public final void persistSortState(@org.jetbrains.annotations.NotNull
    com.example.taskmanagerapp.data.models.Priority priority) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.example.taskmanagerapp.utils.RequestState<java.util.List<com.example.taskmanagerapp.data.models.TaskEntity>>> getAllTasks() {
        return null;
    }
    
    public final void getAllTasks() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.example.taskmanagerapp.data.models.TaskEntity> getSelectedTask() {
        return null;
    }
    
    public final void getSelectedTask(int taskId) {
    }
    
    private final void addTask() {
    }
    
    private final void updateTask() {
    }
    
    private final void deleteTask() {
    }
    
    private final void deleteAllTasks() {
    }
    
    public final void handleDatabaseActions(@org.jetbrains.annotations.NotNull
    com.example.taskmanagerapp.utils.Actions action) {
    }
    
    public final void updateTaskFields(@org.jetbrains.annotations.Nullable
    com.example.taskmanagerapp.data.models.TaskEntity selectedTask) {
    }
    
    public final boolean validateFields() {
        return false;
    }
}