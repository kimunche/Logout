package com.example.hotelproject.service;

import com.example.hotelproject.controller.request.UserCreateRequest;
import com.example.hotelproject.mapper.UserMapper;
import com.example.hotelproject.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    // TODO 리파지토리 추가
    // TODO DB 작업
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }


    public String saveUser(UserCreateRequest request) {
        userMapper.saveUser(request);
        return "저장되었습니다.";
    }

    public void findAll(){
        List<Object> list = userMapper.findAll();
        System.out.println(list.size());
    }

//    public List<UserResponse> getAllUser() {
//        return userRepository.findAllUser();
//    }
//    public List<UserResponse> findUser(String response) {
//        List<UserResponse> userList = userRepository.findUser();
//        return userList;
//    }
//
//    public List<UserResponse> getAllUser() {
//    }
}
