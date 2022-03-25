package com.example.librarymanagementsystem.data.dtos.request;

import lombok.Data;

@Data
public class RegisterRequest {
    private String userName;
    private String password;
    private String userType;
    private String classNameOrDeptName;
}
