//package se.projects.Bookstore.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import se.projects.Bookstore.entity.MostPopularBook;
//import se.projects.Bookstore.repository.MostPopularRepository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class MostPopularService {
//
//    @Autowired
//    MostPopularRepository mostPopularRepository;
//
//    public List<MostPopularBook> retrieveAllMostPopularBook() {
//        return mostPopularRepository.findAll();
//    }
//
//    public Optional<MostPopularBook> retrieveSpecificMostPopularBook(Integer id) {
//        Optional<MostPopularBook> bookOptional = mostPopularRepository.findById(id);
//        return Optional.of(bookOptional.orElse(new MostPopularBook())); // Return empty object if null
//    }
//
//    public MostPopularBook addNewMostPopularBook(MostPopularBook popularBook) {
//        return mostPopularRepository.save(popularBook);
//    }
//
//    public void removeSpecificMostPopularBook(Integer id) {
//        mostPopularRepository.deleteById(id);
//    }
//}


package se.projects.Bookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.projects.Bookstore.entity.Book;
import se.projects.Bookstore.repository.BookRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MostPopularService {

    @Autowired
    BookRepository bookRepository;

    public List<Book> retrieveAllMostPopularBooks() {
        return bookRepository.findAll();
    }

    public Optional<Book> retrieveSpecificMostPopularBook(Integer id) {
        Optional<Book> bookOptional = bookRepository.findById(id);
        return Optional.of(bookOptional.orElse(new Book())); // Return empty object if null
    }
}