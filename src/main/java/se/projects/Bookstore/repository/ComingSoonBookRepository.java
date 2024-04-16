package se.projects.Bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.projects.Bookstore.entity.ComingSoonBook;

public interface ComingSoonBookRepository extends JpaRepository<ComingSoonBook, Integer> {
}
