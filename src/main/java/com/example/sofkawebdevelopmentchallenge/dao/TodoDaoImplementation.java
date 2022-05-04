package com.example.sofkawebdevelopmentchallenge.dao;

import com.example.sofkawebdevelopmentchallenge.entity.Task;
import com.example.sofkawebdevelopmentchallenge.entity.Todo;
import com.example.sofkawebdevelopmentchallenge.repository.TaskRepository;
import com.example.sofkawebdevelopmentchallenge.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TodoDaoImplementation implements TodoDao{

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private TodoRepository todoRepository;


    @Override
    public List<Todo> findAllTodo() {
        return todoRepository.findAll();
    }

    @Override
    public List<Task> findAlLTask() {
        return taskRepository.findAll();
    }

    @Override
    public Todo createTodo(Todo Todo) {
        return todoRepository.save(Todo);
    }

    @Override
    public Todo createTasks(Task task) {
        Todo todo = todoRepository.findById(task.getFkTodoId()).get();
        todo.addTask(task);
        taskRepository.save(task);
        return todoRepository.save(todo);
    }

    @Override
    public void deleteTasks(Task task) {
        taskRepository.deleteById(task.getId());
    }

    @Override
    public void deleteTodo(Todo todo) {
        Todo todoToDelete = todoRepository.findById(todo.getId()).get();
        if(todoToDelete.getListOfTodos().size()>=0){
            todoToDelete.getListOfTodos().forEach(task -> taskRepository.deleteById(task.getId()));
        }
        todoRepository.deleteById(todo.getId());
    }

    @Override
    public Task updateTask(Task task) {
        return taskRepository.save(task);
    }

}
