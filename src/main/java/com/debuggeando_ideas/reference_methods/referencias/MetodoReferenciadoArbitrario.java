package com.debuggeando_ideas.reference_methods.referencias;

import java.util.function.BiPredicate;

public class MetodoReferenciadoArbitrario {

    public static void main(String[] args) {

        BiPredicate<String, String> equals = (s1, s2) -> s1.equals(s2);
        boolean isEqual = equals.test("a", "a");
        System.out.println("isEqual: " + isEqual); // true

        // Referencia arbitraria
        BiPredicate<String, String> equalsReferenceArbitrary = String::equals;
        boolean isEqualArbitrary  = equalsReferenceArbitrary.test("a", "b");
        System.out.println("isEqualArbitrary: " + isEqualArbitrary); // false

    }

}
