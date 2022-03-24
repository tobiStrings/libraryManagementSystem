package com.example.librarymanagementsystem.data.repository.users;

import com.example.librarymanagementsystem.data.models.users.Department;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends MongoRepository<Department,String> {
}
