package com.example.librarymanagementsystem.data.repository.users;

import com.example.librarymanagementsystem.data.models.users.UserClass;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepository extends MongoRepository<UserClass,String> {
}
