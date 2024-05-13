package com.debuggeando_ideas.real_appplications.comparetorLambdas;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparetoLambdas {

    public static void main(String[] args) {

        // Ordenar enteros
        List<Integer> numbers = Arrays.asList(4, 3, 6, 8, 7, 5, 8, 10);
        numbers.sort((a, b) -> a - b);
        System.out.println("Ordenado de mayor a menor: " + numbers);

        // Ordenar Strings
        List<String> names = Arrays.asList( "Max", "Alex", "Opal");
        // names.sort((a, b) -> a.compareTo(b));
        names.sort(String::compareTo); // Ordena de manera alfabetica
        System.out.println("Ordenar alfabeticamente: " + names);

        names.sort(Comparator.reverseOrder());
        System.out.println("Ordenar desendentemente: " + names);


        // Lista de objetos para comparar
        List<Person> persons = Arrays.asList(
            new Person("Robert", 31),
            new Person("Ben", 32),
            new Person("Andy", 32),
            new Person("Petter", 27)
        );

        // Compara enteros del objeto -> Comparator.comparingInt(Person::getAge)
        // thenComparing(Person::getName) -> si tiene la misma edad compara ahora por name
        persons.sort(Comparator.comparingInt(Person::getAge).thenComparing(Person::getName));
        System.out.println("Comparar por edad y nombre: " + persons);

    }

}

@Data
@AllArgsConstructor
class Person {
    private String name;
    private Integer age;
}

