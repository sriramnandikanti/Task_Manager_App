// Generated by Dagger (https://dagger.dev).
package com.example.taskmanagerapp.data.repository;

import com.example.taskmanagerapp.data.TaskDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("dagger.hilt.android.scopes.ViewModelScoped")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TaskRepository_Factory implements Factory<TaskRepository> {
  private final Provider<TaskDao> taskDaoProvider;

  public TaskRepository_Factory(Provider<TaskDao> taskDaoProvider) {
    this.taskDaoProvider = taskDaoProvider;
  }

  @Override
  public TaskRepository get() {
    return newInstance(taskDaoProvider.get());
  }

  public static TaskRepository_Factory create(Provider<TaskDao> taskDaoProvider) {
    return new TaskRepository_Factory(taskDaoProvider);
  }

  public static TaskRepository newInstance(TaskDao taskDao) {
    return new TaskRepository(taskDao);
  }
}
