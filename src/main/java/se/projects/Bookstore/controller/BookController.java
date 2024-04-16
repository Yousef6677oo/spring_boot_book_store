package se.projects.Bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.projects.Bookstore.entity.Book;
import se.projects.Bookstore.service.BookService;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("api/books")
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/get-all-books")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping("/add-book")
    public Book addNewBook(@RequestBody Book book) {
        return bookService.addNewBook(book);
    }

    @DeleteMapping("/delete-book")
    public void removeBook(@PathVariable Integer id) {
        bookService.removeBook(id);
    }
}