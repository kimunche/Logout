package com.example.hotelproject.controller.request;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@NoArgsConstructor
public class UserCreateRequest {
    private Long id;
    private String userName;
    private String userId;
    private String phoneNumber;
    private int age;

    @Builder
    public UserCreateRequest(String userName,
                String userId,
                String phoneNumber,
                int age) {
        this.userName = userName;
        this.userId = userId;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }
}
