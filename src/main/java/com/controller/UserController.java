package com.controller;

import com.model.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The type User controller.
 */
@RestController
@RequestMapping("/users")
public class UserController {
    /**
     * The User service.
     */
    @Autowired
    UserService userService;

    /**
     * Get all users list.
     *
     * @return the list
     */
//get All user
@GetMapping("/")
    public List<User> getAllUsers(){
       return userService.getAllUsers();
    }

    /**
     * Gets user.
     *
     * @param username the username
     * @return the user
     */
//get single user
    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username){
    return userService.getUser(username);
    }

}
