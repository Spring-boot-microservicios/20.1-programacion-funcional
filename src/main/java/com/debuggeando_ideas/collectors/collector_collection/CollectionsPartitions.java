package com.debuggeando_ideas.collectors.collector_collection;

import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionsPartitions {

    public static void main(String[] args) {
        Stream<Videogame> videogames = Database.videogames.stream();

        // Regresa un true con una lista
        // Regresa un false con otroa lista que no cumpla con la condicion
        Map<Boolean, List<Videogame>> result = videogames.collect(Collectors.partitioningBy(
            videogame -> videogame.getPrice() > 15
        ));

        result.forEach((k, v) -> System.out.println(k + " - " + v));

    }

}
