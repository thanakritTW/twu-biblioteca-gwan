package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.util.List;

public class Library {
    private PrintStream printStream;
    private BufferedReader bufferedReader;
    private List<String> books;

    public Library(List<String> books, PrintStream printStream, BufferedReader bufferedReader) {
        this.books = books;
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
    }

    public void listBooks(){

    }

}