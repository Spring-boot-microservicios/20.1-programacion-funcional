package com.debuggeando_ideas.fundamentals.curso_01;

import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Review;
import com.debuggeando_ideas.util.Videogame;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {

        Stream<Videogame> videogames = Database.videogames.stream();

        /**
         * DEBUG en streams -> seleccionamos var myArray = videogames (breakpoint)
         * se ejecuta en modo debug
         * aparecen las opciones del debugger y seleccionamos en more o los tres puntos
         * seleccionamos el Trace Current Stream Chain para ver la vista
         */

        var myArray = videogames
            .distinct()
            .sorted(Comparator.comparing(Videogame::getTotalSold))
            .flatMap(videogame ->
                    videogame.getReviews().stream().map(
                        Review::getComment
                    )
            ).filter(comment -> comment.contains("best"))
            .map("Good comment: "::concat)
            .collect(Collectors.toList());

        System.out.println("myArray: " + myArray);

    }

}
