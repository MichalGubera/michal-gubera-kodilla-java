package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {
    public static void main(String args[]){
        MovieStore movieStore = new MovieStore();
        String movies = movieStore.getMovies().entrySet().stream()
                .map(Map.Entry::getValue)
                .map(movie -> movie.toString())
                .collect(Collectors.joining("!","<<",">>"));
        System.out.println(movies);
    }
}
