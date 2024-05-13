package com.debuggeando_ideas.util_function.paquete_functions.bi_predicate;

import java.util.function.BiPredicate;

public class BiPredicateExample {

    private static BiPredicate<String, String> myEquals = (s1, s2) -> s1.concat(s2).equals("HelloWorld");

    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "World";

        System.out.println("MyEquals: " + myEquals.test(s1, s2)); // true => es igual a HelloWorld

    }

}
