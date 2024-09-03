package com.example.form.controller;

import com.example.form.model.User;
import com.example.form.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.registerUser(user));
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody User user) {
        return userService.findByUsername(user.getUsername())
            .filter(u -> u.getPassword().equals(user.getPassword()))
            .map(u -> ResponseEntity.ok("Login successful"))
            .orElse(ResponseEntity.status(401).body("Invalid credentials"));
    }
}
