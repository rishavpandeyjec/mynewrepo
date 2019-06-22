package com.rishavminor3.SpringDataJpaDemo.controller;

import com.rishavminor3.SpringDataJpaDemo.model.User;
import com.rishavminor3.SpringDataJpaDemo.service.UserService;
import org.hibernate.boot.model.naming.IllegalIdentifierException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController
{

    @Autowired
    UserService userService;
    @GetMapping("/users")
    public List<User>  getAllUsers()
    {
             return userService.findAllUsers();
    }
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") Long id)
    {

             return userService.getUserById(id);
    }
    @PostMapping("/user")
    public User createUser(@RequestBody User user)
    {
            return userService.createUser(user);
    }
    @PutMapping("/user")
    public User updateUser(@RequestBody User user)
    {

           return userService.updateUser(user);
    }

    @DeleteMapping("/user/{id}")
    public User deleteUser(@PathVariable("id") Long id)
    {
           return userService.deleteUser(id);
    }

}
