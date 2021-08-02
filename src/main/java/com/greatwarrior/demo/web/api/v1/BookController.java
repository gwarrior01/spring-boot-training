package com.greatwarrior.demo.web.api.v1;

import com.greatwarrior.demo.domain.Book;
import com.greatwarrior.demo.repository.BookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/book")
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping
    public Iterable<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}
