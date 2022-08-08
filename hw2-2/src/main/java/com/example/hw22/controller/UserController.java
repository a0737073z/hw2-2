package com.example.hw22.controller;

import com.example.hw22.user.User;
import com.example.hw22.userservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
 class UserController {

    @Autowired
    UserService userService;

    @GetMapping()
    public List<User> getAllUsers() {
        List<User> userList = this.userService.getAllUsers();
        return userList;
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable int id) {
        User user = this.userService.getUser(id);
        return user;
    }

    @PostMapping()
    public User createUser(@RequestBody User name) {
        User createUser = this.userService.createUser(name);
        return createUser;
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable int id,@RequestBody User name) {
        User updateUser = this.userService.updateUser(id,name);
        return updateUser;
    }

    @DeleteMapping("/{id}")
    public User deleteUser(@PathVariable int id) {
        User deleteUser = this.userService.deleteUser(id);
        return deleteUser;
    }
} // Class end
