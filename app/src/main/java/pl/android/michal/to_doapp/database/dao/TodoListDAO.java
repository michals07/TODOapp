package pl.android.michal.to_doapp.database.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import pl.android.michal.to_doapp.database.model.TodoList;

/**
 * Created by Michał on 05.04.2018.
 */

@Dao
public interface TodoListDAO {
    @Insert
    public void insertTodoList(TodoList todoList);

    @Update
    public void updateTodoList(TodoList todoList);

    @Delete
    public void deleteTodoList(TodoList todoList);

    @Query("SELECT * FROM todo_lists")
    public TodoList[] selectTodoLists();
}
