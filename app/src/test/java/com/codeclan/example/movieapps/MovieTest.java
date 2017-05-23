package com.codeclan.example.movieapps;

import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by mac on 5/22/17.
 */

public class MovieTest {

    Movie movie;

    @Test
    public void getTitle() {
        Movie movie = new Movie("title", "genre");
        assertEquals("title", movie.getTitle());
    }

    @Test
    public void setTitle() {
        Movie movie = new Movie("title", "genre");
        movie.setTitle("new title");
        assertEquals()
    }

    @Test
    public  void getGenre() {
        Movie movie = new Movie("title", "genre");
        assertEquals("title", movie.getGenre());
    }




}
