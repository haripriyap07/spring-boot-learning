
package com.example.day03;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/user/{id}")
    public String getUser(@PathVariable int id) {
        return "User ID: " + id;
    }

    @GetMapping("/search")
    public String searchUser(@RequestParam String name) {
        return "Searching for: " + name;
    }
    @PostMapping("/create-user")
    public String createUser(@RequestBody User user){
        return "User Created: " +user.getName() + "Age:" + user.getAge();
    }


}