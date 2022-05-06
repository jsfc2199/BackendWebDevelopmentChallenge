package com.example.sofkawebdevelopmentchallenge.dao;

import com.example.sofkawebdevelopmentchallenge.dto.TaskDTO;
import com.example.sofkawebdevelopmentchallenge.dto.TodoDTO;
import com.example.sofkawebdevelopmentchallenge.entity.Task;
import com.example.sofkawebdevelopmentchallenge.entity.Todo;

import java.util.List;

public interface TodoDao {
    TodoDTO createTodo (TodoDTO todo);
    TodoDTO createTasks(TaskDTO task);
    void deleteTasks (TaskDTO task);
    void deleteTodo (TodoDTO todo);
    List<Task> findAlLTask();
    List<TodoDTO> findAllTodo();
    TaskDTO updateTask(TaskDTO task);
}
