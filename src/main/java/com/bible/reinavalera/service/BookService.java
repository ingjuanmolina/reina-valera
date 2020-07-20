package com.bible.reinavalera.service;

import com.bible.reinavalera.model.Book;
import com.bible.reinavalera.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book findById(Integer id) {
        return bookRepository.getOne(id);
    }
}
