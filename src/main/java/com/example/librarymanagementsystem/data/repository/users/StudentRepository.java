package com.example.librarymanagementsystem.data.repository.users;

import com.example.librarymanagementsystem.data.models.users.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student,String> {
}
