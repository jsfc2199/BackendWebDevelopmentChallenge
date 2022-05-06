package com.example.sofkawebdevelopmentchallenge.dao;

import com.example.sofkawebdevelopmentchallenge.dto.TaskDTO;
import com.example.sofkawebdevelopmentchallenge.dto.TaskDTOInterface;
import com.example.sofkawebdevelopmentchallenge.dto.TodoDTO;
import com.example.sofkawebdevelopmentchallenge.dto.TodoDTOInterface;
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

    @Autowired
    private TodoDTOInterface todoMapper;

    @Autowired
    private TaskDTOInterface taskMapper;


    @Override
    public List<TodoDTO> findAllTodo() {
        List<Todo> todosList = todoRepository.findAll();
        return todoMapper.fromTodoToTodoDto(todosList);
    }

    @Override
    public List<Task> findAlLTask() {
        return taskRepository.findAll();
    }

    @Override
    public TodoDTO createTodo(TodoDTO todoDto) {
        Todo todo = todoMapper.fromTodoDTOtoTodo(todoDto);
        todoRepository.save(todo);
        return todoMapper.fromTodotoTodoDTO(todo);
    }

    @Override
    public TodoDTO createTasks(TaskDTO taskDto) {
        Todo todo = todoRepository.findById(taskDto.getFkTodoId()).get();
        todo.addTask(taskMapper.fromTaskDTOtoTask(taskDto));
        taskRepository.save(taskMapper.fromTaskDTOtoTask(taskDto));
        Todo todoSave = todoRepository.save(todo);
        return todoMapper.fromTodotoTodoDTO(todoSave);
    }

    @Override
    public void deleteTasks(TaskDTO taskDto) {
        Task taskToDelete = taskMapper.fromTaskDTOtoTask(taskDto);
        taskRepository.deleteById(taskToDelete.getId());
    }

    @Override
    public void deleteTodo(TodoDTO todoDto) {


        Todo todoToBeDeleted = todoMapper.fromTodoDTOtoTodo(todoDto);
        if(todoToBeDeleted.getListOfTasks().size()>=0){
            todoToBeDeleted.getListOfTasks().forEach(task -> taskRepository.deleteById(task.getId()));
        }
        todoRepository.deleteById(todoToBeDeleted.getId());

    }

    @Override
    public TaskDTO updateTask(TaskDTO taskDto) {
        Task taskToUpdate = taskMapper.fromTaskDTOtoTask(taskDto);
        return taskMapper.fromTasjtoTaskDTO(taskRepository.save(taskToUpdate));
    }

}
