package se.projects.Bookstore.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;
    private String image_url;
    private String book_link;
    private String authors;
    private Double rating;
    private Double price;
    private Double discount;
    private Integer review_count;
    private Integer rating_count;
    private Integer num_pages;
    private String quote1;
    private String quote2;
    private String quote3;
    private String description;
    private String category;
}
