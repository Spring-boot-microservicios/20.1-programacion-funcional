package com.debuggeando_ideas.util_function.paquete_functions.binary_operator;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    public static void main(String[] args) {

        BiFunction<String, String, String> normalizerFunc = (a, b) -> a.toUpperCase() + " - " + b.toLowerCase();
        System.out.println("normalizerFunc: " + normalizerFunc.apply("hola", "MUndo"));

        // Mejor utilizar el BinaryOperator es el qeuivalente
        BinaryOperator<String> normalizer = (a, b) -> a.toUpperCase() + " - " + b.toLowerCase();
        System.out.println("normalizer: " + normalizer.apply("hola", "MUndo"));

    }

}
