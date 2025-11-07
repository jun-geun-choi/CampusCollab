package com.example.grouvy.approval.dto;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookFormData {
    private String requestDept;
    private String desiredDate;
    private String reason;
    private String totalQty;
    private String totalPrice;
    List<Book> books;

    @Getter
    public static class Book {
        private String title;
        private String publisher;
        private String author;
        private String quantity;
        private String price;
    }
}
