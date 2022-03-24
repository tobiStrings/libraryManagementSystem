package com.example.librarymanagementsystem.data.models.Book;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class FeedBack {
    @Id
    private String id;
    private String userName;
    private String comment;
}
