package se.projects.Bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.projects.Bookstore.entity.CategoryBook;

import java.util.List;

public interface CategoryRepository extends JpaRepository<CategoryBook,Integer> {
    List<CategoryBook> findByCategory(String category);
}
