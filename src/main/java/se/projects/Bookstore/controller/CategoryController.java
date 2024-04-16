//package se.projects.Bookstore.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import se.projects.Bookstore.entity.CategoryBook;
//import se.projects.Bookstore.service.CategoryService;
//
//import java.util.List;
//
//@RestController
//@CrossOrigin("http://localhost:3000")
//@RequestMapping("api/books")
//public class CategoryController {
//
//    @Autowired
//    CategoryService categoryService;
//
//    @GetMapping("/all-category")
//    public List<CategoryBook> getAllCategoryBooks() {
//        return categoryService.retrieveAllCategoryBook();
//    }
//
//    @GetMapping("/category/{category}")
//    public List<CategoryBook> getSpecificCategoryBooks(@PathVariable String category) {
//        return categoryService.retrieveSpecificCategoryBook(category);
//    }
//
//    @PostMapping("/add-category-book")
//    public CategoryBook addMostPopularBook(@RequestBody CategoryBook categoryBook) {
//        return categoryService.addNewCategoryBook(categoryBook);
//    }
//
//    @DeleteMapping("/delete-category-book/{id}")
//    public void removeCategoryBook(@PathVariable Integer id) {
//        categoryService.removeSpecificCategoryBook(id);
//    }
//}


package se.projects.Bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.projects.Bookstore.entity.Book;
import se.projects.Bookstore.service.CategoryService;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("api/books")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/all-category")
    public List<Book> getAllCategoryBooks() {
        return categoryService.retrieveAllCategoryBook();
    }

    @GetMapping("/category/{category}")
    public List<Book> getSpecificCategoryBooks(@PathVariable String category) {
        return categoryService.retrieveSpecificCategoryBook(category);
    }
}