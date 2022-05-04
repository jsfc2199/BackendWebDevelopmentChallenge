package com.example.sofkawebdevelopmentchallenge.controller;

import com.example.sofkawebdevelopmentchallenge.entity.Task;
import com.example.sofkawebdevelopmentchallenge.entity.Todo;
import com.example.sofkawebdevelopmentchallenge.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
public class Controller {

    @Autowired
    private TodoService service;

    @GetMapping("get/todos")
    public List<Todo> getAllTodos(){
        return service.findAllTodo();
    }

    @GetMapping("get/taks")
    public List<Task> getAllTasks(){
        return service.findAlLTask();
    }

    @PostMapping("create/post")
    public Todo createTodo (@RequestBody Todo todo){
        return service.createTodo(todo);
    }

    @PostMapping("create/task")
    public Todo createTask(@RequestBody Task task){
        return service.createTasks(task);
    }

    @DeleteMapping("delete/todo")
    public void deleteTodo(@RequestBody Todo todo){
        service.deleteTodo(todo);
    }

    @DeleteMapping("delete/task")
    public void deleteTask(@RequestBody Task task){
        service.deleteTasks(task);
    }

    @PutMapping("update/task")
    public void updateTask(@RequestBody Task task){
        service.updateTask(task);
    }
}
