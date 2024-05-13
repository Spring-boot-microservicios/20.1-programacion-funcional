package com.debuggeando_ideas.util_function.paquete_functions.unary_operator;

import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

//    private static Function<String, String> funToUpper = s -> s.toUpperCase();
    private static Function<String, String> funToUpper = String::toUpperCase;

    private static UnaryOperator<String> unaryToUpper = String::toUpperCase;

    private static UnaryOperator<Integer> int1 = n -> n * n;
    private static IntUnaryOperator int2 = n -> n * n; // Interfaz diseñada para retornar un mismo tipo
    private static DoubleUnaryOperator numberPlus10 = num -> num + 10;

    public static void main(String[] args) {
        String arg = "lambdas";

        System.out.println("arg function: " + funToUpper.apply(arg)); // LAMBDAS
        System.out.println("arg unaryOperator: " + unaryToUpper.apply(arg)); // LAMBDAS

        System.out.println("int1: " + int1.apply(3)); // 9
        System.out.println("int2: " + int2.applyAsInt(4)); // 16

        System.out.println("numberPlus10: " + numberPlus10.applyAsDouble(8.0));

    }

}
