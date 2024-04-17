package se.projects.Bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.projects.Bookstore.entity.Book;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {
    List<Book> findByTitleContaining(String keyword);

    List<Book> findByAuthorsContaining(String keyword);

    List<Book> findByDescriptionContaining(String keyword);

    List<Book> findByCategory(String category);

    List<Book> findByCategoryContaining(String keyword);

    List<Book> findByPrice(Double price);
}