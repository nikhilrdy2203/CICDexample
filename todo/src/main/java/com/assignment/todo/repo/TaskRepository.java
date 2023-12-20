package com.assignment.todo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.todo.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
    // You can add custom queries here if needed
}

