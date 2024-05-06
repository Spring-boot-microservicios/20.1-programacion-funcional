package com.debuggeando_ideas.reference_methods.referencias;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

// Tipo de referencia | Referencia metodo | Expresion lambda
// Metodo estatico | String::valueOf | s -> String.valueOf(s)
// Metodo de un objeto especifico | var r = new Random() r::nextInt | var r = new Random() n -> r.nextInt(n)
// Metodo arbitrario | String::equals | (s1, s2) -> s1.equals(s2)
// Metodo constructor | Person::new | a -> new Person(a)
public class MetodoObjetoReferenciado {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(10);
        IntStream repeat = IntStream.range(1, 11); // 1 al 10

//        repeat.forEach(i -> System.out.println(i));
//        repeat.forEach(i -> numbers.add(i));

        // Metodo referenciado por objeto
        repeat.forEach(numbers::add);

        System.out.println("numbers: " + numbers);
    }

}
