package com.example.sofkawebdevelopmentchallenge.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "Task")
@Table(name = "todolist")
@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String todolistName;
    private boolean isCompleted;
    private Long fkTodoId;
}
