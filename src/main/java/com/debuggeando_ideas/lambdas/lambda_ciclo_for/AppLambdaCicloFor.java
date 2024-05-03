package com.debuggeando_ideas.lambdas.lambda_ciclo_for;

import java.util.List;

public class AppLambdaCicloFor {

    public static void main(String[] args) {

        // For normal
        List<String> countries = List.of("Mexico", "Colombia", "Argentina", "Chile", "Uruguay");

        for (String country: countries) {
            System.out.println("Country name: " + country);
        }

        // For con lambdas
        countries.forEach(country -> System.out.println("Country name lambda: " + country.toUpperCase()));

    }

}
