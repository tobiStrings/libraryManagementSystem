package com.example.librarymanagementsystem.service.user;

import com.example.librarymanagementsystem.data.dtos.request.RegisterRequest;
import com.example.librarymanagementsystem.data.dtos.response.RegisterResponse;
import com.example.librarymanagementsystem.exceptions.LibraryException;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    RegisterResponse register(RegisterRequest request) throws LibraryException;

}
