package com.example.sofkawebdevelopmentchallenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ITodoRepository extends JpaRepository<Todo, Long> {
}
