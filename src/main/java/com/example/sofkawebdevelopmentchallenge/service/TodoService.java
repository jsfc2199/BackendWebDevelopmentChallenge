package com.example.sofkawebdevelopmentchallenge.service;

import com.example.sofkawebdevelopmentchallenge.dao.TodoDaoImplementation;
import com.example.sofkawebdevelopmentchallenge.dto.TaskDTO;
import com.example.sofkawebdevelopmentchallenge.dto.TodoDTO;
import com.example.sofkawebdevelopmentchallenge.entity.Task;
import com.example.sofkawebdevelopmentchallenge.entity.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoDaoImplementation todoDaoImplementation;


    public List<TodoDTO> findAllTodo() {
        return todoDaoImplementation.findAllTodo();
    }


    public List<Task> findAlLTask() {
        return todoDaoImplementation.findAlLTask();
    }


    public TodoDTO createTodo(TodoDTO todo) {
        return todoDaoImplementation.createTodo(todo);
    }

    public TodoDTO createTasks(TaskDTO task) {
        return todoDaoImplementation.createTasks(task);
    }


    public void deleteTasks(TaskDTO task) {
        todoDaoImplementation.deleteTasks(task);
    }


    public void deleteTodo(TodoDTO todo) {
        todoDaoImplementation.deleteTodo(todo);
    }

    public TaskDTO updateTask(TaskDTO task){
        return todoDaoImplementation.updateTask(task);
    }
}
