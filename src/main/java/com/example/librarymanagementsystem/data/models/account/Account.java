package com.example.librarymanagementsystem.data.models.account;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Account {
    @Id
    private String id;
    private String accountOwner;
    private int no_borrowed_books;
    private int no_reserved_books;
    private int no_returned_books;
    private int no_lost_books;
    private double fine_amount;
}
