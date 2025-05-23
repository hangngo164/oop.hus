package oop.lab07.ex4p1;
import java.util.*;
import java.io.*;
public class Movie implements Comparable<Movie>{
    private String name;
    private double rating;
    private int year;

    public int compareTo(Movie movie) {
        return this.year - movie.getYear();
    }
    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }
}
