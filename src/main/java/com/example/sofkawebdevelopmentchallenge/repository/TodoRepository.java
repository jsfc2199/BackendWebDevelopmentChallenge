package com.example.sofkawebdevelopmentchallenge.repository;

import com.example.sofkawebdevelopmentchallenge.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
