package com.example.todolistapp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.todolistapp.modules.Task;
import com.example.todolistapp.repos.TaskRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TaskService {

    private final TaskRepo repo;

    public List<Task> getAllTasks() {
        return repo.findAll();
    }

    //la STRING que recibe por parámetro debe ser la misma que definimos en el "name" del input (en el html)
    public void createTask(String title) {
        Task task = new Task();
        task.setTitle(title);
        task.setCompleted(false);
        repo.save(task);

    }

    public void deleteTask(Long id) {
        repo.deleteById(id);
    }

    public void toggleTask(Long id) {
        Task task = repo.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Invalid task id"));
        task.setCompleted(!task.isCompleted());
        repo.save(task);
    }

}
