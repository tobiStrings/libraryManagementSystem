package com.example.librarymanagementsystem.data.models.users;

import com.example.librarymanagementsystem.data.enums.Type;
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
    private Type.Class studentsUserClass;
}
