package com.example.hotelproject.controller;

import com.example.hotelproject.controller.request.UserCreateRequest;
import com.example.hotelproject.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("api/v1/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/createUser")
    public String createUser(@RequestBody UserCreateRequest request) {
        return userService.saveUser(request);
    }

}
