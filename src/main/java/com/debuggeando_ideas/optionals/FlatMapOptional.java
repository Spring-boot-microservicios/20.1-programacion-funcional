package com.debuggeando_ideas.optionals;

import com.debuggeando_ideas.util.Movie;

import java.util.Optional;

public class FlatMapOptional {

    public static void main(String[] args) {

        Movie movie = new Movie("The nun", 20.42);

        Optional<Movie> movieOptional = Optional.of(movie);

        String movieName = movieOptional.flatMap(Movie::getName).get();

        System.out.println("Movie name: " + movieName);

    }

}
