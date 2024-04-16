package se.projects.Bookstore.service;//package se.projects.Bookstore.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import se.projects.Bookstore.entity.FreeBook;
//import se.projects.Bookstore.repository.FreeBookRepository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class FreeBookService {
//    @Autowired
//    FreeBookRepository freeBookRepository;
//
//
//    public List<FreeBook> retrieveAllFreeBook() {
//        return freeBookRepository.findAll();
//    }
//
//    public Optional<FreeBook> retrieveSpecificFreeBook(Integer id) {
//        Optional<FreeBook> bookOptional = freeBookRepository.findById(id);
//        return Optional.of(bookOptional.orElse(new FreeBook())); // Return empty object if null
//    }
//
//    public FreeBook addNewFreeBook(FreeBook freeBook) {
//        return freeBookRepository.save(freeBook);
//    }
//
//    public void removeSpecificFreeBook(Integer id) {
//        freeBookRepository.deleteById(id);
//    }
//}


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.projects.Bookstore.entity.Book;
import se.projects.Bookstore.repository.BookRepository;

import java.util.List;
import java.util.Optional;

@Service
public class FreeBookService {
    @Autowired
    BookRepository bookRepository;

    public List<Book> retrieveAllFreeBooks() {
        return bookRepository.findByPrice(0.0);
    }

    public Optional<Book> retrieveSpecificFreeBook(Integer id) {
        Optional<Book> bookOptional = bookRepository.findById(id);
        return Optional.of(bookOptional.orElse(new Book())); // Return empty object if null
    }
}