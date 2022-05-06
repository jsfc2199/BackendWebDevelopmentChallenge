package com.example.sofkawebdevelopmentchallenge.dto;

import com.example.sofkawebdevelopmentchallenge.entity.Task;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskDTOInterface {
    TaskDTO fromTasjtoTaskDTO(Task task);
    List<TaskDTO> fromTaskToTaskDto(List<Task> tasks);

    @InheritInverseConfiguration
    Task fromTaskDTOtoTask(TaskDTO taskDto);
}
