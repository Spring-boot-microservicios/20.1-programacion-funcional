package com.debuggeando_ideas.collectors.collector_collection;

import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsToCollection {

    private static Collection<Videogame> streamToCollection(Stream<Videogame> stream, String type) {
        return (type.equals("LIST")) ? stream.collect(Collectors.toList()) : stream.collect(Collectors.toSet());
    }

    private static Map<String, Double> streamToMap(Stream<Videogame> stream) {
        return stream
                .distinct()
                .collect(Collectors.toMap(Videogame::getName, Videogame::getPrice));
    }

    public static void main(String[] args) {
        Stream<Videogame> videogames = Database.videogames.stream();

        // System.out.println("List: " + streamToCollection(videogames, "LIST").getClass().getName()); // java.util.ArrayList
        // System.out.println("Set: " + streamToCollection(videogames, "SET").getClass().getName()); // java.util.HashSet
        // streamToCollection(videogames, "SET").forEach(System.out::println);
        // streamToCollection(videogames, "LIST").forEach(System.out::println);

        // streamToMap(videogames).forEach((k, v) -> System.out.println(k + " - " + v)); // Generar un stream a un map, con un distinct
    }

}
