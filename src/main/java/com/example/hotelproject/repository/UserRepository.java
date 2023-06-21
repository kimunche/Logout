package com.example.hotelproject.repository;

import com.example.hotelproject.controller.request.UserCreateRequest;
import com.example.hotelproject.domain.User;

public interface UserRepository {
    int saveUser(UserCreateRequest user);
}
