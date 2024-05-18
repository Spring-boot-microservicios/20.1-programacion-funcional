package com.debuggeando_ideas.streams.stream_intermediate_operators;

import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIntermediateOperators {

    private static void distinctOperator(Stream<Videogame> stream) {
        System.out.println("Distinct: " + stream.distinct().count());
    }

    private static void limitOperator(Stream<Videogame> stream) {
        List<Videogame> videogames = stream.limit(5).collect(Collectors.toList());
        videogames.forEach(System.out::println);
    }

    private static void skipOperator(Stream<Videogame> stream) {
        List<Videogame> videogames = stream.skip(15).collect(Collectors.toList()); // son 20 -> trae los ultimos 5 elementos
        videogames.forEach(System.out::println);
    }

    public static void main(String[] args) {
        Stream<Videogame> videogames = Database.videogames.stream();

        // System.out.println("Total elements: " + videogames.count()); // 20 elementos
        // distinctOperator(videogames); // 19 elementos -> Quita los repetidos
        // limitOperator(videogames); // Trae los primeros 5 elementos
        skipOperator(videogames); // Trae los ultimos 5 elementos de los 20 que tenemos, y parte apartir del 15

    }

}
