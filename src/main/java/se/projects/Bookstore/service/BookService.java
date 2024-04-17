package se.projects.Bookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.projects.Bookstore.entity.Book;
import se.projects.Bookstore.repository.BookRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book addNewBook(Book book) {
        return bookRepository.save(book);
    }

    public void removeBook(Integer id) {
        bookRepository.deleteById(id);
    }

    public List<Book> searchBooks(String keyword) {
        List<Book> byTitle = bookRepository.findByTitleContaining(keyword);
        List<Book> byAuthors = bookRepository.findByAuthorsContaining(keyword);
        List<Book> byDescription = bookRepository.findByDescriptionContaining(keyword);
        List<Book> byCategory = bookRepository.findByCategoryContaining(keyword);

        List<Book> searchResults = Stream.of(byTitle, byAuthors, byDescription, byCategory)
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());

        return searchResults;
    }
}
