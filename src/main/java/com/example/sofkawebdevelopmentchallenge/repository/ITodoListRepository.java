package com.example.sofkawebdevelopmentchallenge.repository;

import com.example.sofkawebdevelopmentchallenge.entity.TodoList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITodoListRepository extends JpaRepository<TodoList, Long> {
}
