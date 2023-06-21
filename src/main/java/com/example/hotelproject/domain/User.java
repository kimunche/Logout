package com.example.hotelproject.domain;

import lombok.Builder;

public class User {
    private String userName;
    private String userId;
    private String phoneNumber;
    private int age;

    @Builder
    public User(String userName,
                String userId,
                String phoneNumber,
                int age) {
        this.userName = userName;
        this.userId = userId;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }
}
