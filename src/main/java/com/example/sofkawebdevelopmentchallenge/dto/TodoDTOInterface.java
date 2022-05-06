package com.example.sofkawebdevelopmentchallenge.dto;

import com.example.sofkawebdevelopmentchallenge.entity.Todo;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses ={TaskDTOInterface.class})
public interface TodoDTOInterface {
    TodoDTO fromTodotoTodoDTO(Todo todo);
    List<TodoDTO> fromTodoToTodoDto(List<Todo> todos);

    @InheritInverseConfiguration
    Todo fromTodoDTOtoTodo(TodoDTO todoDto);
}
