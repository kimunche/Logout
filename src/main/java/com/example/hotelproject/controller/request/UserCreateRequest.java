package com.example.hotelproject.controller.request;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@NoArgsConstructor
public class UserCreateRequest {
    private String userName;
    private String phoneNumber;
    private int age;

    @Builder
    public UserCreateRequest(String userName,
                             String phoneNumber,
                             int age) {
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }
}
