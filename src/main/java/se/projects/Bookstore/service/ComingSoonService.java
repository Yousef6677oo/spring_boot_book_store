package se.projects.Bookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.projects.Bookstore.entity.ComingSoonBook;
import se.projects.Bookstore.repository.ComingSoonBookRepository;

import java.util.List;

@Service
public class ComingSoonService {
    @Autowired
    ComingSoonBookRepository comingSoonBookRepository;

    public List<ComingSoonBook> retrieveAllComingSoonBooks() {
        return comingSoonBookRepository.findAll();
    }

    public ComingSoonBook addComingSoonBook(ComingSoonBook comingSoonBook) {
        return comingSoonBookRepository.save(comingSoonBook);
    }
}