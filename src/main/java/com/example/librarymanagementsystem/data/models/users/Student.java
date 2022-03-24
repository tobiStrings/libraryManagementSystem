package com.example.librarymanagementsystem.data.models.users;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@EqualsAndHashCode(callSuper = true)
@Data
@Document
public class Student extends User{
    @Id
    private String id;
    private UserClass studentsUserClass;
}
