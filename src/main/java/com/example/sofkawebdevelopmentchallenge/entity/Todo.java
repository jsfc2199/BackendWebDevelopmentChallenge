package com.example.sofkawebdevelopmentchallenge.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Todo")
@Table(name = "todo")
@Data
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Task> listOfTasks = new ArrayList<>();

    public Todo addTask(Task task){
        this.listOfTasks.add(task);
        return this;
    }
}
