package com.debuggeando_ideas.util_function.paquete_functions;

import java.util.function.Function;

public class FunctionExample {

    // Operaciones
    static Function<Integer, Integer> multiply = n -> n * 10;
    static Function<Integer, Integer> sum = n -> n + 10;

    // Combinado las funciones
    static Function<Integer, Integer> addThenMultiply = multiply.andThen(sum);
    // 5 * 10 = 50 despues 50 + 10 = 60

    static Function<Integer, Integer> composeMultiply = multiply.compose(sum); // combina
    // 5 + 10 = 15 despues 15 * 10 = 150

    public static void main(String[] args) {

        System.out.println("function multiply: " + multiply.apply(5)); // 50
        System.out.println("function sum: " + sum.apply(5)); // 15

        System.out.println("function addThenMultiply: " + addThenMultiply.apply(5)); // 60
        System.out.println("function composeMultiply: " + composeMultiply.apply(5)); // 150

    }

}
