package com.example.sofkawebdevelopmentchallenge.controller;

import com.example.sofkawebdevelopmentchallenge.dto.TaskDTO;
import com.example.sofkawebdevelopmentchallenge.dto.TodoDTO;
import com.example.sofkawebdevelopmentchallenge.entity.Task;
import com.example.sofkawebdevelopmentchallenge.entity.Todo;
import com.example.sofkawebdevelopmentchallenge.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
@CrossOrigin("http://localhost:3000/")
public class Controller {

    @Autowired
    private TodoService service;

    @GetMapping("get/todos")
    public List<TodoDTO> getAllTodos(){
        return service.findAllTodo();
    }

    @GetMapping("get/taks")
    public List<Task> getAllTasks(){
        return service.findAlLTask();
    }

    @PostMapping("create/post")
    public TodoDTO createTodo (@RequestBody TodoDTO todo){
        return service.createTodo(todo);
    }

    @PostMapping("create/task")
    public TodoDTO createTask(@RequestBody TaskDTO task){
        return service.createTasks(task);
    }

    @DeleteMapping("delete/todo")
    public void deleteTodo(@RequestBody TodoDTO todo){
        service.deleteTodo(todo);
    }

    @DeleteMapping("delete/task")
    public void deleteTask(@RequestBody TaskDTO task){
        service.deleteTasks(task);
    }

    @PutMapping("update/task")
    public TaskDTO updateTask(@RequestBody TaskDTO task){
        return service.updateTask(task);
    }
}
