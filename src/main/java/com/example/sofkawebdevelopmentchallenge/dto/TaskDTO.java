package com.example.sofkawebdevelopmentchallenge.dto;


public class TaskDTO {
    private Long id;
    private String todolistName;
    private boolean isCompleted;
    private Long fkTodoId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTodolistName() {
        return todolistName;
    }

    public void setTodolistName(String todolistName) {
        this.todolistName = todolistName;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public Long getFkTodoId() {
        return fkTodoId;
    }

    public void setFkTodoId(Long fkTodoId) {
        this.fkTodoId = fkTodoId;
    }
}
