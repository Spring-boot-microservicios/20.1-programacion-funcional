package com.debuggeando_ideas.streams.stream_final_operators;

import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamFinalOperators {

    private static void countOperator(Stream<Videogame> stream) {
        System.out.println("Count: " + stream.count());
    }

    private static void forEachOperator(Stream<Videogame> stream) {
        stream.forEach(System.out::println);
    }

    private static void anyMatchOperator(Stream<Videogame> stream) {
        boolean result = stream.anyMatch(videogame -> videogame.getTotalSold() > 1);

        // Vendidos
        System.out.println("anyMatchOperator > 1: " + result);
    }

    private static void allMatchOperator(Stream<Videogame> stream) {
        boolean result = stream.allMatch(videogame -> videogame.getTotalSold() > 150);

        // Vendidos
        System.out.println("allMatchOperator > 150: " + result);
    }

    private static void noneMatchOperator(Stream<Videogame> stream) {
        // Sino tiene alguna reseña
        boolean result = stream.noneMatch(videogame -> videogame.getReviews().isEmpty());
        System.out.println("noneMatchOperator isEmpty: " + result);
    }

    private static void findFirstOperator(Stream<Videogame> stream) {
        Optional<Videogame> videogame = stream.findFirst();
        System.out.println("findFirstOperator: " + videogame);
    }

    private static void findAnyOperator(Stream<Videogame> stream) {
        Optional<Videogame> videogame = stream.findAny();
        System.out.println("findAnyOperator: " + videogame);
    }

    public static void main(String[] args) {
        Stream<Videogame> videogames = Database.videogames.stream();

        // Operadores finales, no permite continuar, falla por ese esta comentado
        // countOperator(videogames);
        // forEachOperator(videogames);

        // anyMatchOperator(videogames); // Regresa true porque el predicado o condicion cumple con el parametro
        // allMatchOperator(videogames); // Regresa false porque no todos han vendido mas de 150
        // noneMatchOperator(videogames); // false porque al menos uno no cumple el resultado

        // findFirstOperator(videogames); // Obtiene el primer elemento y requiere de un Optional
        // findAnyOperator(videogames); // Regresa cualquier elemento pero casi siempre es el primero

    }

}
