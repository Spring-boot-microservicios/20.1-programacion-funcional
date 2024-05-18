package com.debuggeando_ideas.streams.curso_06;

import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Review;
import com.debuggeando_ideas.util.Videogame;

import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

public class ExerciseLambdas {

    public static void main(String[] args) {
        Stream<Videogame> videogames = Database.videogames.stream();

        // System.out.println("exercise1: " + exercise1(videogames)); // true
        // exercise2(videogames).forEach(System.out::println);
        // System.out.println("Mayor numero de ventas: " + exercise3(videogames));
        // exercise4(videogames).forEach(System.out::println);
        // exercise5(videogames).forEach(System.out::println);
    }

    /*
     *Regresar true si el stream contiene al menos un videojuego con número de ventas mayor a 10
     * y no este en descuento o su precio sea mayor a 9.99 de lo contrario regresar false.
     */
    static Boolean exercise1(Stream<Videogame> stream) {
        return stream.anyMatch(videogame ->
            videogame.getTotalSold() > 10 &&
            !videogame.getIsDiscount() ||
            videogame.getPrice() > 9.99
        );
    }

    /*
     *Regresar un Stream unicamente con los titulos de todas las consolas que sean de XBOX
     * durante el proceso imprimir los resultados ignorando los repetidos.
     */
    static Stream<String> exercise2(Stream<Videogame> stream) {
        return stream.distinct()
                .filter(videogame -> videogame.getConsole().name().equals("XBOX"))
                .peek(System.out::println)
                .map(Videogame::getName);
    }

    /*
     *Regresar el videojuego con el mayor número de ventas
     * unicamente contemplando los primers 10 elementos del stream.
     */
    static Videogame exercise3(Stream<Videogame> stream) {
        return stream
            .limit(10)
            .peek(System.out::println)
            .max(Comparator.comparingInt(Videogame::getTotalSold))
            .orElseThrow(NoSuchElementException::new);
    }

    /*
     *Regresar un stream con todos los comentarios del cada review de todos los videojuegos del stream.
     */
    static Stream<String> exercise4(Stream<Videogame> stream) {
        return stream
            .flatMap(videogame -> videogame.getReviews().stream())
            .map(Review::getComment)
            .filter(comment -> !comment.isEmpty());
    }

    /*
     *Regresar un stream con los todos los videojuegos con precio menores a 20.0
     * sin utilizar el operador filter().
     */
    static Stream<Double> exercise5(Stream<Videogame> stream) {
        return stream
            .sorted(Comparator.comparingDouble(Videogame::getPrice))
            .takeWhile(videogame -> videogame.getPrice() < 20.0)
            .map(Videogame::getPrice);
    }

}
