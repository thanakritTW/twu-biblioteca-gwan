package com.twu.biblioteca.menu;

import com.twu.biblioteca.Book;
import com.twu.biblioteca.Library;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

import static org.mockito.Mockito.*;

public class ReturnLibraryMenuTest {
    private ReturnLibraryMenu menu;
    private Library library;
    private List<Book> books;
    private PrintStream printStream;
    private BufferedReader bufferedReader;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        library = mock(Library.class);
        menu = new ReturnLibraryMenu(library, printStream, bufferedReader);
    }

    @Test
    public void Show_WhenSuccessfullyReturn_ShouldShowThankYou() throws IOException {
        when(library.returnBook("First Book")).thenReturn(true);
        when(bufferedReader.readLine()).thenReturn("First Book");

        menu.show();

        verify(this.printStream).println("Thank you for returning the book");
    }

    @Test
    public void Show_WhenUnSuccessfullyReturn_ShouldShowSorry() throws IOException {
        when(library.returnBook("First Book")).thenReturn(false);
        when(bufferedReader.readLine()).thenReturn("First Book");

        menu.show();

        verify(this.printStream).println("Sorry that is not a valid book to return");
    }

}