package com.debuggeando_ideas.streams.stream_final_operators;

import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

import java.util.stream.Stream;

public class StreamFinalOperators {

    private static void countOperator(Stream<Videogame> stream) {
        System.out.println("Count: " + stream.count());
    }

    private static void forEachOperator(Stream<Videogame> stream) {
        stream.forEach(System.out::println);
    }

    public static void main(String[] args) {
        Stream<Videogame> videogames = Database.videogames.stream();

        // Operadores finales, no permite continuar, falla por ese esta comentado
        // countOperator(videogames);
        forEachOperator(videogames);
    }

}
