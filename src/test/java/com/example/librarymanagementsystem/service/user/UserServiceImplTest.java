package com.example.librarymanagementsystem.service.user;

import com.example.librarymanagementsystem.data.dtos.request.RegisterRequest;
import com.example.librarymanagementsystem.exceptions.LibraryException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceImplTest {
    @Autowired
    UserService userService;

    @BeforeEach
    void setUp(){
        userService = new UserServiceImpl();
    }

    @Test
    @DisplayName("Test that dto validation works fine")
    void testDtoValidation(){
        RegisterRequest request = new RegisterRequest();
        assertThrows(LibraryException.class,()-> userService.register(request));
    }
}