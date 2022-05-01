package com.company;

public class Movie {
    private int rating;
    private String title;

    public Movie(String title, int rating) {
        this.title = title;
        this.rating = rating;

    }
    public Movie() {
        this.title = title;
        this.rating = rating;

    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getRating() {
        return rating;
    }









}
