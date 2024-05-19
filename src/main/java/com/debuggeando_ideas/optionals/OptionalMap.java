package com.debuggeando_ideas.optionals;

import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

import java.util.Optional;

public class OptionalMap {

    public static void main(String[] args) {

         Optional<Videogame> gtaOpt = Optional.of(Database.videogames.get(5));

         // Mala practica usar el .get() mejor usar el orElse..
         String website = gtaOpt.map(videogame -> "The official website is " + videogame.getOfficialWebsite())
                 .orElseThrow(RuntimeException::new);

        System.out.println("Website: " + website);

    }

}
