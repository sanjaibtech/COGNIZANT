package com.library;

public class BookService {
    private BookRepository bookRepository;
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public void addBook() {
        bookRepository.saveBook();
        System.out.println("BookService: addBook() called.");
    }
}