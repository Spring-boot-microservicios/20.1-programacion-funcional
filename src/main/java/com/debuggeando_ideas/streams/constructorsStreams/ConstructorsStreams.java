package com.debuggeando_ideas.streams.constructorsStreams;

import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class ConstructorsStreams {

    public static void main(String[] args) {
        Stream<Videogame> myStream = Database.videogames.stream();
        myStream.forEach(System.out::println);

        System.out.println("-----");

        // Transformar un Integer[] a un Stream<Integer>
        Integer[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Stream<Integer> integerStream = Arrays.stream(myArray);

        integerStream.forEach(System.out::println);

        System.out.println("-----");

        Stream.of("Hola", "Mundo").forEach(System.out::println);

        System.out.println("-----");

        DoubleStream myDoubleStream = DoubleStream.of(20.3, 30.2, 0.0);
        myDoubleStream.forEach(System.out::println);

    }

}
