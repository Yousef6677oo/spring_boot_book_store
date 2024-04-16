//package se.projects.Bookstore.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import se.projects.Bookstore.entity.CategoryBook;
//import se.projects.Bookstore.entity.FreeBook;
//import se.projects.Bookstore.repository.CategoryRepository;
//
//import java.util.List;
//
//@Service
//public class CategoryService {
//
//    @Autowired
//    CategoryRepository categoryRepository;
//
//    public List<CategoryBook> retrieveAllCategoryBook() {
//        return categoryRepository.findAll();
//    }
//
//    public List<CategoryBook> retrieveSpecificCategoryBook(String category) {
//        return categoryRepository.findByCategory(category);
//    }
//
//    public CategoryBook addNewCategoryBook(CategoryBook categoryBook) {
//        return categoryRepository.save(categoryBook);
//    }
//
//    public void removeSpecificCategoryBook(Integer id) {
//        categoryRepository.deleteById(id);
//    }
//}


package se.projects.Bookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.projects.Bookstore.entity.Book;
import se.projects.Bookstore.repository.BookRepository;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    BookRepository bookRepository;

    public List<Book> retrieveAllCategoryBooks() {
        return bookRepository.findAll();
    }

    public List<Book> retrieveSpecificCategoryBook(String category) {
        return bookRepository.findByCategory(category);
    }
}