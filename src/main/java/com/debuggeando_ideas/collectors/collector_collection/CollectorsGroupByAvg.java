package com.debuggeando_ideas.collectors.collector_collection;

import com.debuggeando_ideas.util.Console;
import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsGroupByAvg {

    public static void main(String[] args) {
        Stream<Videogame> videogames = Database.videogames.stream();

        Map<Console, IntSummaryStatistics> result = videogames.collect(Collectors.groupingBy(
            Videogame::getConsole,
            Collectors.summarizingInt(Videogame::getTotalSold) // funciones de reduccion
        ));

        // Total de ventas por categoria de consola
        result.forEach((k, v) -> System.out.println(k + " - " + v.getSum()));

    }

}
