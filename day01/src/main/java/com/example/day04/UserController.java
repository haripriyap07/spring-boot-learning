package com.example.day04;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/users")
public class UserController {

    List<User> users = new ArrayList<>();

    @GetMapping
    public List<User> getUsers() {
        return users;
    }

    @PostMapping
    public String createUser(@RequestBody User user) {
        users.add(user);
        return "User added successfully";
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable int id, @RequestBody User updatedUser) {

        for(User user : users){
            if(user.getId() == id){
                user.setName(updatedUser.getName());
                return "User updated";
            }
        }

        return "User not found";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) {

        users.removeIf(user -> user.getId() == id);
        return "User deleted";
    }
}