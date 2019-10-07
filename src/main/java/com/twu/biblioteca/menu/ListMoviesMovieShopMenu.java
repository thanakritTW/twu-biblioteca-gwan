package com.twu.biblioteca.menu;

import com.twu.biblioteca.Movie;
import com.twu.biblioteca.MovieShop;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.util.List;

public class ListMoviesMovieShopMenu extends MovieShopMenu implements MenuInterface {
    public ListMoviesMovieShopMenu(MovieShop movieShop, String description, PrintStream printStream, BufferedReader bufferedReader) {
        super(movieShop, description, printStream, bufferedReader);
    }

    public ListMoviesMovieShopMenu(MovieShop movieShop,PrintStream printStream, BufferedReader bufferedReader) {
        super(movieShop, "List all available movies", printStream, bufferedReader);
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    public void show(){

    }
}