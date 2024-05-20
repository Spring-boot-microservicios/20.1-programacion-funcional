package com.debuggeando_ideas.complejidad_ciclomatica;

import com.debuggeando_ideas.util.Console;
import com.debuggeando_ideas.util.Videogame;

import java.util.Objects;

public class Rules {

    public static Validator<Videogame, RuntimeException> isNull = videogame -> {
        if (Objects.isNull(videogame)) throw new IllegalArgumentException("Cant be null");
    };

    public static Validator<Videogame, RuntimeException> validPrice = videogame -> {
        if (videogame.getPrice() < 20) throw new InvalidVideogameException("Price must be greater than 20");
    };

    public static Validator<Videogame, RuntimeException> validConsole = videogame -> {
        if (!videogame.getConsole().equals(Console.XBOX)) throw new InvalidVideogameException("Console must be for XBOX");
    };

    public static Validator<Videogame, RuntimeException> validReviews = videogame -> {
        if (videogame.getReviews().isEmpty()) throw new InvalidVideogameException("Reviews cannot be empty");
    };

    public static Validator<Videogame, RuntimeException> validTotalSold = videogame -> {
        if (videogame.getTotalSold() < 10) throw new InvalidVideogameException("Total sold must be greater than 10");
    };

    public static Validator<Videogame, RuntimeException> validDiscount = videogame -> {
        if(videogame.getIsDiscount()) throw new InvalidVideogameException("Videogame dont have discount");
    };

}
