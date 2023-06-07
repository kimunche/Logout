package com.example.hotelproject.service;

import com.example.hotelproject.controller.request.UserCreateRequest;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    // TODO 리파지토리 추가
    // TODO DB 작업


    public Long saveUser(UserCreateRequest request) {

        System.out.println("저장되었습니다.");
        return 1L;
    }
}
