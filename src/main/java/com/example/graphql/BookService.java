package com.example.graphql;

import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class BookService {
    private Map<String, Book> books = new HashMap<>();

    public List<Book> getAllBooks() {
        return new ArrayList<>(books.values());
    }

    public Book getBookById(String id) {
        return books.get(id);
    }

    public Book addBook(BookInput input) {
        String id = UUID.randomUUID().toString();
        Book book = new Book(id, input.getTitle(), input.getAuthor());
        books.put(id, book);
        return book;
    }
}
