package com.example.sofkawebdevelopmentchallenge.dto;

import com.example.sofkawebdevelopmentchallenge.entity.Task;

import java.util.ArrayList;
import java.util.List;


public class TodoDTO {
    private Long id;
    private String name;
    private List<Task> listOfTasks = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Task> getListOfTasks() {
        return listOfTasks;
    }

    public void setListOfTasks(List<Task> listOfTasks) {
        this.listOfTasks = listOfTasks;
    }
}
