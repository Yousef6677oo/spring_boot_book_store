package se.projects.Bookstore.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "free_book")
public class FreeBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;
    private String description;
    private String image_url;
    private String book_link;
    private String quote1;
    private String quote2;
    private String quote3;
}
