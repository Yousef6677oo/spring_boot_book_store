//package se.projects.Bookstore.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import se.projects.Bookstore.entity.FreeBook;
//import se.projects.Bookstore.service.FreeBookService;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@CrossOrigin("http://localhost:3000")
//@RequestMapping("api/books")
//public class FreeBookController {
//    @Autowired
//    FreeBookService freeBookService;
//
//    @GetMapping("/free-book")
//    public List<FreeBook> getAllFreeBooks() {
//        return freeBookService.retrieveAllFreeBook();
//    }
//
//    @GetMapping("/free-book/{id}")
//    public Optional<FreeBook> getFreeBook(@PathVariable Integer id) {
//        return freeBookService.retrieveSpecificFreeBook(id);
//    }
//
//    @PostMapping("/add-free-book")
//    public FreeBook addMostPopularBook(@RequestBody FreeBook freeBook) {
//        return freeBookService.addNewFreeBook(freeBook);
//    }
//
//    @DeleteMapping("/delete-free-book/{id}")
//    public void removeMostPopularBook(@PathVariable Integer id) {
//        freeBookService.removeSpecificFreeBook(id);
//    }
//}


package se.projects.Bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.projects.Bookstore.entity.Book;
import se.projects.Bookstore.service.FreeBookService;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("api/books")
public class FreeBookController {
    @Autowired
    FreeBookService freeBookService;

    @GetMapping("/free-book")
    public List<Book> getAllFreeBooks() {
        return freeBookService.retrieveAllFreeBooks();
    }

    @GetMapping("/free-book/{id}")
    public Optional<Book> getFreeBook(@PathVariable Integer id) {
        return freeBookService.retrieveSpecificFreeBook(id);
    }
}