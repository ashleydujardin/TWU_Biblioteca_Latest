package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by ashleycampo on 6/20/14.
 */
public class LibraryTest {
    private Library library;
    private PrintStream mockStream;
    private List<Book> books;

    @Before
    public void setUp() {
        mockStream = mock(PrintStream.class);
        books.add(new Book("Head First Java", "Bill", "1924"));
        books.add(new Book("Game of Thrones", "J.R.R. Martin", "1992"));
        library = new Library(mockStream, books);
    }

    @Test
    public void testListBooks() throws IOException {
        library.listBooks();
        verify(mockStream).printf("%-20s %-20s %-20s\n", "Head First Java", "Bill", "1924");
        verify(mockStream).printf("%-20s %-20s %-20s\n", "Head First Java", "Bill", "1924");
    }
}