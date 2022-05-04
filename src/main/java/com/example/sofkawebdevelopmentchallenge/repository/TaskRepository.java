package com.example.sofkawebdevelopmentchallenge.repository;

import com.example.sofkawebdevelopmentchallenge.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
