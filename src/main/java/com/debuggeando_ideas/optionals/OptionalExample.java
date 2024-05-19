package com.debuggeando_ideas.optionals;

import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        // Optional<Videogame> gtaOpt = Optional.of(Database.videogames.get(5));
        Optional<Videogame> gtaOpt = Optional.ofNullable(null); // Pueden llegar nulos

        System.out.println("Optional: " + gtaOpt.orElseThrow(() -> new RuntimeException("Videogame not found")));

    }

}
