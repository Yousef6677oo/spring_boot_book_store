package se.projects.Bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.projects.Bookstore.entity.ComingSoonBook;
import se.projects.Bookstore.service.ComingSoonService;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("api/books")
public class ComingSoonController {
    @Autowired
    ComingSoonService comingSoonService;

    @GetMapping("/get-all-coming-soon")
    public List<ComingSoonBook> getAllComingSoonBooks() {
        return comingSoonService.retrieveAllComingSoonBooks();
    }

    @PostMapping("/add-coming-soon")
    public ComingSoonBook getAllComingSoonBooks(@RequestBody ComingSoonBook comingSoonBook) {
        return comingSoonService.addComingSoonBook(comingSoonBook);
    }
}
