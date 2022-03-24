package com.example.librarymanagementsystem.data.models.users;

import com.example.librarymanagementsystem.data.enums.UserType;
import com.example.librarymanagementsystem.data.models.Book.Book;
import com.example.librarymanagementsystem.data.models.account.Account;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class User {
    @Id
    private String id;
    private String name;
    private String password;
    private String userName;
    private UserType userType;
    private Account userAccount;
    private List<Book>books;
}
