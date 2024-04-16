package se.projects.Bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.projects.Bookstore.entity.Book;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Integer> {
    List<Book> findByCategory(String category);
    List<Book> findByPrice(Double price);
}