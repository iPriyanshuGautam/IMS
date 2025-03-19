//package com.ims.controller;
//
//public class UserController {
//
//}
package com.ims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ims.entity.User;
import com.ims.service.UserService;

@RestController
@RequestMapping("/auth")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        userService.registerUser(user);
        return "User registered successfully!";
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        boolean isAuthenticated = userService.loginUser(user.getEmail(), user.getPassword());
        return isAuthenticated ? "Login Successful!" : "Invalid Credentials!";
    }
}
