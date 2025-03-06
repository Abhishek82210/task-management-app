package com.example.tast_management_system.controller;

import com.example.tast_management_system.entity.Task;
import com.example.tast_management_system.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

// ✅ Allow CORS requests from frontend (e.g., VS Code Live Server)
@CrossOrigin(origins = {"http://127.0.0.1:5500", "http://localhost:3000"})
@RestController
@RequestMapping("/api/tasks") // ✅ Updated to match CORS config
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/{id}")
    public Optional<Task> getTaskById(@PathVariable Long id) {
        return taskService.getTaskById(id);
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task updatedTask) {
        return taskService.updateTask(id, updatedTask);
    }

    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return "Task deleted Successfully";
    }
}
