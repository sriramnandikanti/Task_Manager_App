package com.example.taskmanagerapp.data;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.taskmanagerapp.data.models.Priority;
import com.example.taskmanagerapp.data.models.TaskEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TaskDao_Impl implements TaskDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<TaskEntity> __insertionAdapterOfTaskEntity;

  private final EntityDeletionOrUpdateAdapter<TaskEntity> __deletionAdapterOfTaskEntity;

  private final EntityDeletionOrUpdateAdapter<TaskEntity> __updateAdapterOfTaskEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllTasks;

  public TaskDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTaskEntity = new EntityInsertionAdapter<TaskEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `task_table` (`id`,`title`,`description`,`priority`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TaskEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        if (value.getPriority() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, __Priority_enumToString(value.getPriority()));
        }
      }
    };
    this.__deletionAdapterOfTaskEntity = new EntityDeletionOrUpdateAdapter<TaskEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `task_table` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TaskEntity value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfTaskEntity = new EntityDeletionOrUpdateAdapter<TaskEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `task_table` SET `id` = ?,`title` = ?,`description` = ?,`priority` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TaskEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        if (value.getPriority() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, __Priority_enumToString(value.getPriority()));
        }
        stmt.bindLong(5, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAllTasks = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM task_table";
        return _query;
      }
    };
  }

  @Override
  public Object addTask(final TaskEntity taskEntity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfTaskEntity.insert(taskEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteTask(final TaskEntity taskEntity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfTaskEntity.handle(taskEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object updateTask(final TaskEntity taskEntity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfTaskEntity.handle(taskEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteAllTasks(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllTasks.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllTasks.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Flow<List<TaskEntity>> getAllTasks() {
    final String _sql = "SELECT * FROM task_table ORDER BY id ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"task_table"}, new Callable<List<TaskEntity>>() {
      @Override
      public List<TaskEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfPriority = CursorUtil.getColumnIndexOrThrow(_cursor, "priority");
          final List<TaskEntity> _result = new ArrayList<TaskEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TaskEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final Priority _tmpPriority;
            _tmpPriority = __Priority_stringToEnum(_cursor.getString(_cursorIndexOfPriority));
            _item = new TaskEntity(_tmpId,_tmpTitle,_tmpDescription,_tmpPriority);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<TaskEntity> getSelectedTask(final int taskId) {
    final String _sql = "SELECT * FROM task_table WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, taskId);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"task_table"}, new Callable<TaskEntity>() {
      @Override
      public TaskEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfPriority = CursorUtil.getColumnIndexOrThrow(_cursor, "priority");
          final TaskEntity _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final Priority _tmpPriority;
            _tmpPriority = __Priority_stringToEnum(_cursor.getString(_cursorIndexOfPriority));
            _result = new TaskEntity(_tmpId,_tmpTitle,_tmpDescription,_tmpPriority);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<TaskEntity>> searchDatabase(final String searchQuery) {
    final String _sql = "SELECT * FROM task_table \n"
            + "        WHERE title LIKE ? \n"
            + "        OR description LIKE ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (searchQuery == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, searchQuery);
    }
    _argIndex = 2;
    if (searchQuery == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, searchQuery);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"task_table"}, new Callable<List<TaskEntity>>() {
      @Override
      public List<TaskEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfPriority = CursorUtil.getColumnIndexOrThrow(_cursor, "priority");
          final List<TaskEntity> _result = new ArrayList<TaskEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TaskEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final Priority _tmpPriority;
            _tmpPriority = __Priority_stringToEnum(_cursor.getString(_cursorIndexOfPriority));
            _item = new TaskEntity(_tmpId,_tmpTitle,_tmpDescription,_tmpPriority);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<TaskEntity>> sortByLowPriority() {
    final String _sql = "SELECT * FROM task_table \n"
            + "        ORDER BY CASE \n"
            + "        WHEN priority LIKE 'L%' THEN 1 \n"
            + "        WHEN priority LIKE 'M%' THEN 2 \n"
            + "        WHEN priority LIKE 'H%' THEN 3 END";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"task_table"}, new Callable<List<TaskEntity>>() {
      @Override
      public List<TaskEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfPriority = CursorUtil.getColumnIndexOrThrow(_cursor, "priority");
          final List<TaskEntity> _result = new ArrayList<TaskEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TaskEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final Priority _tmpPriority;
            _tmpPriority = __Priority_stringToEnum(_cursor.getString(_cursorIndexOfPriority));
            _item = new TaskEntity(_tmpId,_tmpTitle,_tmpDescription,_tmpPriority);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<TaskEntity>> sortByHighPriority() {
    final String _sql = "SELECT * FROM task_table \n"
            + "        ORDER BY CASE \n"
            + "        WHEN priority LIKE 'H%' THEN 1 \n"
            + "        WHEN priority LIKE 'M%' THEN 2 \n"
            + "        WHEN priority LIKE 'L%' THEN 3 END";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"task_table"}, new Callable<List<TaskEntity>>() {
      @Override
      public List<TaskEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfPriority = CursorUtil.getColumnIndexOrThrow(_cursor, "priority");
          final List<TaskEntity> _result = new ArrayList<TaskEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TaskEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final Priority _tmpPriority;
            _tmpPriority = __Priority_stringToEnum(_cursor.getString(_cursorIndexOfPriority));
            _item = new TaskEntity(_tmpId,_tmpTitle,_tmpDescription,_tmpPriority);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }

  private String __Priority_enumToString(final Priority _value) {
    if (_value == null) {
      return null;
    } switch (_value) {
      case HIGH: return "HIGH";
      case MEDIUM: return "MEDIUM";
      case LOW: return "LOW";
      case NONE: return "NONE";
      default: throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + _value);
    }
  }

  private Priority __Priority_stringToEnum(final String _value) {
    if (_value == null) {
      return null;
    } switch (_value) {
      case "HIGH": return Priority.HIGH;
      case "MEDIUM": return Priority.MEDIUM;
      case "LOW": return Priority.LOW;
      case "NONE": return Priority.NONE;
      default: throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + _value);
    }
  }
}
