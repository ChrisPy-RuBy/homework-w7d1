package com.codeclan.example.movieapps;

/**
 * Created by mac on 5/22/17.
 */

public class Movie {

    private String title;
    private String genre;

    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;

    }

    public String getTitle() {
        return this.title;
    }

    public String getGenre() {
        return this.genre;
    }
}