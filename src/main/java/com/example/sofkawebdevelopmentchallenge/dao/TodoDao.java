package com.example.sofkawebdevelopmentchallenge.dao;

import com.example.sofkawebdevelopmentchallenge.entity.Task;
import com.example.sofkawebdevelopmentchallenge.entity.Todo;

import java.util.List;

public interface TodoDao {
    Todo createTodo (Todo Todo);
    Todo createTasks(Task task);
    void deleteTasks (Task task);
    void deleteTodo (Todo todo);
    List<Task> findAlLTask();
    List<Todo> findAllTodo();
    Task updateTask(Task task);
}
