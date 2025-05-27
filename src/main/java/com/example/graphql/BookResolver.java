package com.example.graphql;


import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookResolver implements GraphQLQueryResolver, GraphQLMutationResolver {
    private final BookService bookService;

    public BookResolver(BookService bookService) {
        this.bookService = bookService;
    }

    public List<Book> getBooks() {
        return bookService.getAllBooks();
    }

    public Book getBook(String id) {
        return bookService.getBookById(id);
    }

    public Book addBook(BookInput input) {
        return bookService.addBook(input);
    }
}
