package com.example.activitytracker.activitytracker.service;

import com.example.activitytracker.activitytracker.dto.TaskDto;
import com.example.activitytracker.activitytracker.dto.UserDto;
import com.example.activitytracker.activitytracker.model.Task;
import com.example.activitytracker.activitytracker.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
public interface UserService {
    User registerUser(UserDto userDTO);

    String loginUser(String email, String password);

    Task createTask(TaskDto taskDTO);

    Task updateTitleAndDescription(TaskDto taskDTO , int id);

    Task getTaskById(int id);

    List<Task> viewAllTasks();

    boolean updateTaskStatus(String status, int id);

    List<Task> viewAllTaskByStatus(String status);

    boolean deleteById(int id);
    User getUserByEmail(String email);
}
