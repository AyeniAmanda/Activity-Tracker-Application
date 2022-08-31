package com.example.activitytracker.activitytracker;

import com.example.activitytracker.activitytracker.dto.TaskDto;
import com.example.activitytracker.activitytracker.dto.UserDto;
import com.example.activitytracker.activitytracker.model.Task;
import com.example.activitytracker.activitytracker.model.User;
import com.example.activitytracker.activitytracker.repository.TaskRepository;
import com.example.activitytracker.activitytracker.repository.UserRepository;
import com.example.activitytracker.activitytracker.serviceImpl.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.util.Calendar.AUGUST;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@SpringBootTest
class Week8ApplicationTests {

    @Test
    void contextLoads() {
    }

//    @Mock
//    UserRepository userRepository;
//
//    @Mock
//    TaskRepository taskRepository;
//
//    @InjectMocks
//    UserServiceImpl userServiceImpl;
//
//    private User user;
//    private UserDto userDTO;
//    private TaskDto taskDTO;
//    private Task task;
//    private LocalDateTime time;
//    List<Task> taskList;
//    @BeforeEach
//    void setUp() {
//        time = LocalDateTime.of(2022, AUGUST,2,9,20,9,20000);
//        taskList = new ArrayList<>();
//        taskList.add(task);
//        this.user = new User(1, "Amanda" , "Amandaayeni@gmail.com" , "1234" , taskList);
//        this.task = new Task(1, "Write Code" , "Code till 7am" , "pending" , time , time , time , user);
//        this.taskDTO = new TaskDto("Write Code" , "Code till 7am" );
//        this.userDTO = new UserDto("Amanda" , "Amandaayeni@gmail.com", "1234");
//        when(userRepository.save(user)).thenReturn(user);
//        when(taskRepository.save(task)).thenReturn(task);
//        when(taskRepository.findAll()).thenReturn(taskList);
//        when(taskRepository.listOfTasksByStatus("pending")).thenReturn(taskList);
//        // when(taskRepository.(1)).thenReturn(Optional.ofNullable())
//        when(userRepository.findById(1)).thenReturn(Optional.ofNullable(user));
//        when(taskRepository.findById(1)).thenReturn(Optional.ofNullable(task));
//        when(userRepository.findUserByEmail("Amandaayeni@gmail.com")).thenReturn(Optional.of(user));
//        when(taskRepository.updateTaskByIdAndStatus("ongoing" , 1)).thenReturn(true);
//
//    }
//
//    @Test
//    void registerUser() {
//        when(userServiceImpl.registerUser(userDTO)).thenReturn(user);
//        var actual = userServiceImpl.registerUser(userDTO);
//        var expected = user;
//        assertEquals( expected , actual );
//    }
//
//    @Test
//    void loginUser_Successfull() {
//        String message = "Success";
//        assertEquals(message , userServiceImpl.loginUser("Amandaayeni@gmail.com" , "1234"));
//    }
//
//    @Test
//    void loginUser_Unsuccessfull() {
//        String message = "incorrect password";
//        assertEquals(message , userServiceImpl.loginUser("Amandaayeni@gmail.com" , "12345"));
//    }
//
//
//    @Test
//    void createTask() {
//        when(userServiceImpl.createTask(taskDTO)).thenReturn(task);
//        assertEquals(task , userServiceImpl.createTask(taskDTO));
//    }
//
//    @Test
//    void updateTitleAndDescription() {
//        assertEquals(task , userServiceImpl.updateTitleAndDescription(taskDTO , 1));
//    }
//
//    @Test
//    void viewAllTasks() {
//        assertEquals(1 , userServiceImpl.viewAllTasks().size());
//    }
////
////    @Test
////    void viewAllTaskByStatus() {
////
////        assertEquals(taskList , userServiceImpl.viewAllTaskByStatus("pending"));
////    }
////
//////    @Test
//////    void deleteById() {
//////        when(userServiceImpl.deleteById(1)).thenReturn(true);
//////        assertTrue(userServiceImpl.deleteById(1));
//////    }
////
////    @Test
////    void updateTaskStatus() {
////        assertTrue(userServiceImpl.updateTaskStatus("ongoing" , 1));
////    }
////
////    @Test
////    void getUserByEmail() {
////        assertEquals(user , userServiceImpl.getUserByEmail("enwerevincent@gmail.com"));
////    }
////
////    @Test
////    void getTaskById() {
////        assertEquals(task, userServiceImpl.getTaskById(1));
////    }

}
