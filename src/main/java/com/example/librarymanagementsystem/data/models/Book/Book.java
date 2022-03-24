package com.example.librarymanagementsystem.data.models.Book;

import com.example.librarymanagementsystem.data.enums.ReservationStatus;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.Date;
import java.util.List;

@Document
@Data
public class Book {
    @Id
    private String id;
    private String tittle;
    private String info;
    private String isbn;
    private Publication publication;
    private ReservationStatus reservationStatus;
    private Date dueDate = new Date();
    private List<FeedBack> feedBacks;

}
