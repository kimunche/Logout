package com.example.hotelproject.service;

import com.example.hotelproject.controller.request.UserCreateRequest;
import com.example.hotelproject.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    // TODO 리파지토리 추가
    // TODO DB 작업
    private UserRepository userRepository;

    public String saveUser(UserCreateRequest request) {
        userRepository.saveUser(request);
        return "저장되었습니다.";
    }

}
