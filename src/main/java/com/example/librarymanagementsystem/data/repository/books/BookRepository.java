package com.example.librarymanagementsystem.data.repository.books;

import com.example.librarymanagementsystem.data.models.Book.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends MongoRepository<Book,String> {
}
