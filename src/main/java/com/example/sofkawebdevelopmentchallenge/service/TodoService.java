package com.example.sofkawebdevelopmentchallenge.service;

import com.example.sofkawebdevelopmentchallenge.dao.TodoDaoImplementation;
import com.example.sofkawebdevelopmentchallenge.entity.Task;
import com.example.sofkawebdevelopmentchallenge.entity.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoDaoImplementation todoDaoImplementation;


    public List<Todo> findAllTodo() {
        return todoDaoImplementation.findAllTodo();
    }


    public List<Task> findAlLTask() {
        return todoDaoImplementation.findAlLTask();
    }


    public Todo createTodo(Todo todo) {
        return todoDaoImplementation.createTodo(todo);
    }

    public Todo createTasks(Task task) {
        return todoDaoImplementation.createTasks(task);
    }


    public void deleteTasks(Task task) {
        todoDaoImplementation.deleteTasks(task);
    }


    public void deleteTodo(Todo todo) {
        todoDaoImplementation.deleteTodo(todo);
    }

    public Task updateTask(Task task){
        return todoDaoImplementation.updateTask(task);
    }
}
