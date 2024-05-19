package com.debuggeando_ideas.collectors.collector_collection;

import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsReduceFunctions {

    // Obtener el promedio
    private static void avg(Stream<Videogame> stream) {
        Double avg = stream.collect(Collectors.averagingDouble(Videogame::getPrice));
        System.out.println("Promedio AVG: " + avg);
    }

    private static void sum(Stream<Videogame> stream) {
        IntSummaryStatistics summaryStatistics = stream.collect(Collectors.summarizingInt(
            v -> v.getReviews().size()
        ));
        System.out.println("summaryStatistics suma: " + summaryStatistics.getSum());
        System.out.println("summaryStatistics max: " + summaryStatistics.getMax());
        System.out.println("summaryStatistics min: " + summaryStatistics.getMin());
        System.out.println("summaryStatistics avarage: " + summaryStatistics.getAverage());
    }

    private static void join(Stream<Videogame> stream) {
        String string = stream
                .map(Videogame::toString)
                .collect(Collectors.joining("\n"));

        System.out.println(string);
    }

    public static void main(String[] args) {
        Stream<Videogame> videogames = Database.videogames.stream();

        // avg(videogames);
        // sum(videogames);
        join(videogames);

    }

}
