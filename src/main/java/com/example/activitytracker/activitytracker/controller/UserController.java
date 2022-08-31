package com.example.activitytracker.activitytracker.controller;

import com.example.activitytracker.activitytracker.dto.TaskDto;
import com.example.activitytracker.activitytracker.dto.UserDto;
import com.example.activitytracker.activitytracker.model.Task;
import com.example.activitytracker.activitytracker.model.User;
import com.example.activitytracker.activitytracker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

import java.util.List;

@Controller
@RequestMapping(value = "")
public class UserController {


    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/dashboard")
    public String index(Model model) {
        List<Task> allTasks = userService.viewAllTasks();
        model.addAttribute("tasks", allTasks);
        return "dashboard";
    }

    @GetMapping(value = "/login")
    public String displayLoginPage(Model model) {
        model.addAttribute("userDetails", new UserDto());
        return "login";
    }

    @PostMapping(value = "/loginUser")
    public String loginUser(@RequestParam String email, @RequestParam String password, HttpSession session, Model model) {
        String message = userService.loginUser(email, password);

        if (message.equals("Success")) {
            User user = userService.getUserByEmail(email);
            session.setAttribute("email", user.getEmail());
            session.setAttribute("id", user.getId());
            session.setAttribute("name", user.getName());
            return "redirect:/dashboard";
        } else {
            model.addAttribute("errorMessage", message);
            return "redirect:/login";
        }


    }

    @GetMapping(value = "/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("userRegistrationDetails", new UserDto());
        return "register";
    }

    @PostMapping(value = "/userRegistration")
    public String registration(@ModelAttribute UserDto userDTO) {

        User registeredUser = userService.registerUser(userDTO);
        if (registeredUser != null) {

            return "redirect:/login";
        } else {
            return "redirect:/register";
        }
    }

    @GetMapping(value = "/task/{status}")
    public String taskByStatus(@PathVariable(name = "status") String status, Model model) {
        List<Task> listOfTaskByStatus = userService.viewAllTaskByStatus(status);
        model.addAttribute("tasksByStatus", listOfTaskByStatus);
        return "task-by-status";
    }

    @PostMapping("/delete/{id}")
    public String deleteTask(@PathVariable(name = "id") Integer id) {
        userService.deleteById(id);
        return "redirect:/dashboard";
    }

    @GetMapping(value = "/editPage/{id}")
    public String showEditPage(@PathVariable(name = "id") Integer id, Model model) {
        Task task = userService.getTaskById(id);
        model.addAttribute("singleTask", task);
        model.addAttribute("taskBody", new TaskDto());
        return "editTask";
    }

    @PostMapping(value = "/edit/{id}")
    public String editTask(@PathVariable(name = "id") Integer id, @ModelAttribute TaskDto taskDTO) {
        userService.updateTitleAndDescription(taskDTO, id);
        return "redirect:/dashboard";
    }

    @GetMapping(value = "/addNewTask")
    public String addTask(Model model) {
        model.addAttribute("newTask", new TaskDto());
        return "addTask";
    }

    @PostMapping(value = "/addTask")
    public String CreateTask(@ModelAttribute TaskDto taskDTO) {
        userService.createTask(taskDTO);
        return "redirect:/dashboard";
    }
}


