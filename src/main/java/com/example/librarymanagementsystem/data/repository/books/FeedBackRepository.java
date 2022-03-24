package com.example.librarymanagementsystem.data.repository.books;

import com.example.librarymanagementsystem.data.models.Book.FeedBack;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedBackRepository extends MongoRepository<FeedBack,String> {
}
