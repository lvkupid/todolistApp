package com.example.todolistapp.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.todolistapp.modules.Task;

public interface TaskRepo extends JpaRepository<Task, Long>{

}
