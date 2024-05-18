package com.debuggeando_ideas.streams.stream_intermediate_operators;

import com.debuggeando_ideas.util.BasicVideogame;
import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Review;
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

    private static void filterOperator(Stream<Videogame> stream) {
        List<Videogame> videogames = stream
                .filter(videogame -> videogame.getPrice() > 12.0)
                .filter(videogame -> !videogame.getIsDiscount())
                .filter(videogame -> videogame.getOfficialWebsite().contains("forza"))
                .collect(Collectors.toList());

        videogames.forEach(System.out::println);
    }

    private static void mapOperator(Stream<Videogame> stream) {

        List<BasicVideogame> basicVideogames = stream
                .map(videogame -> {
                    return BasicVideogame.builder()
                            .name(videogame.getName())
                            .price(videogame.getPrice())
                            .console(videogame.getConsole())
                            .build();
                }).collect(Collectors.toList());

        basicVideogames.forEach(System.out::println);

        // Stream<BasicVideogame> streamBasicVideogames = basicVideogames.stream();

        List<String> titles = basicVideogames.stream().map(BasicVideogame::getName).collect(Collectors.toList());
        titles.forEach(System.out::println);
    }

    private static void flatMapOperator(Stream<Videogame> stream) {
        // List<List<Review>> videogames = stream.map(Videogame::getReviews).collect(Collectors.toList());
        // System.out.println("Lista de listas" + videogames);

        List<Review> videogames = stream.flatMap(videogame -> videogame.getReviews().stream()).collect(Collectors.toList());
        System.out.println("Lista aplanada" + videogames);
    }

    private static void mapVsFlatMapOperator(Stream<Videogame> stream) {
        // List<Integer> totalReviews = stream.map(videogame -> videogame.getReviews().size()).collect(Collectors.toList());
        // System.out.println("Total reviews: " + totalReviews.size()); // 20 -> es incorrecto

        Long totalReviews = stream.flatMap(videogame -> videogame.getReviews().stream()).count();
        System.out.println("Total reviews flapMap: " + totalReviews); // 48 reviews -> son las correctas

    }

    public static void main(String[] args) {
        Stream<Videogame> videogames = Database.videogames.stream();

        // System.out.println("Total elements: " + videogames.count()); // 20 elementos
        // distinctOperator(videogames); // 19 elementos -> Quita los repetidos
        // limitOperator(videogames); // Trae los primeros 5 elementos
        // skipOperator(videogames); // Trae los ultimos 5 elementos de los 20 que tenemos, y parte apartir del 15

        // filterOperator(videogames); // Realiza un filtrado por x condicion que necesitemos

        // mapOperator(videogames); // Transforma un objeto a otro tipo

        // flatMapOperator(videogames); // Aplana una lista de listas [ [..], [..] ] a [.., ..]

        mapVsFlatMapOperator(videogames);

    }

}
