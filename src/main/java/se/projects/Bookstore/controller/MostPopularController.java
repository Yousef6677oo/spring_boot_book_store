//package se.projects.Bookstore.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import se.projects.Bookstore.entity.MostPopularBook;
//import se.projects.Bookstore.service.MostPopularService;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@CrossOrigin("http://localhost:3000")
//@RequestMapping("api/books")
//public class MostPopularController {
//
//    @Autowired
//    MostPopularService mostPopularService;
//
//    @GetMapping("/most-popular")
//    public List<MostPopularBook> getAllMostPopularBooks() {
//        return mostPopularService.retrieveAllMostPopularBook();
//    }
//
//    @GetMapping("/most-popular/{id}")
//    public Optional<MostPopularBook> getMostPopularBook(@PathVariable Integer id) {
//        return mostPopularService.retrieveSpecificMostPopularBook(id);
//    }
//
//    @PostMapping("/add-most-popular")
//    public MostPopularBook addMostPopularBook(@RequestBody MostPopularBook popularBook) {
//        return mostPopularService.addNewMostPopularBook(popularBook);
//    }
//
//    @DeleteMapping("/delete-most-popular/{id}")
//    public void removeMostPopularBook(@PathVariable Integer id) {
//        mostPopularService.removeSpecificMostPopularBook(id);
//    }
//}


package se.projects.Bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.projects.Bookstore.entity.Book;
import se.projects.Bookstore.service.MostPopularService;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("api/books")
public class MostPopularController {

    @Autowired
    MostPopularService mostPopularService;

    @GetMapping("/most-popular")
    public List<Book> getAllMostPopularBooks() {
        return mostPopularService.retrieveAllMostPopularBooks();
    }

    @GetMapping("/most-popular/{id}")
    public Optional<Book> getMostPopularBook(@PathVariable Integer id) {
        return mostPopularService.retrieveSpecificMostPopularBook(id);
    }
}