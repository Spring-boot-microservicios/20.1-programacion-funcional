package com.debuggeando_ideas.util_function.paquete_functions.consumer;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ConsumerExample {

    // Consumer no regresa ningun resultado, solo hace las operaciones
    // BiConsumer para tipo Maps de clave valor
    public static void main(String[] args) {

        Set<Integer> numbers = Set.of(1, 2, 3, 4, 5); // Devuelve los numeros desordenados aleatoreamente
        List<Integer> squares = new LinkedList<>();

        numbers.forEach(num -> squares.add(num * num));

        System.out.println("Squares: " + squares);

        Map<Boolean, String> map = Map.of(true, "this is the truth", false, "this is the lie");

        // BiConsumer
        map.forEach((k, v) -> System.out.println(k + " - " + v));

    }

}
