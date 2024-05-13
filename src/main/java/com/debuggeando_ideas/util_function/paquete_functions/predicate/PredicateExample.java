package com.debuggeando_ideas.util_function.paquete_functions.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    private static Predicate<Integer> isGreaterThan100 = num -> num > 100;
    private static Predicate<Integer> isLessThan10 = num -> num < 10;

    // or, and
    private static Predicate<Integer> isBetween10And100= isGreaterThan100.or(isLessThan10);

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 10, 50, 100, 150, 200));
        System.out.println("Numbers Old: " + numbers);

        // Remueve los que cumplan la condicion
        // numbers.removeIf(num -> num > 100); // mayor a 100
        // System.out.println("Numbers New: " + numbers);

        // Predicado entre 10 y 100
        // numbers.removeIf(isBetween10And100.negate()); // negamos la condicion
        numbers.removeIf(isBetween10And100);

        System.out.println("Number isBetween10And100: " + numbers);

    }

}
