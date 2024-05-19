package com.debuggeando_ideas.util;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.Optional;

@AllArgsConstructor
@ToString
public class Movie {
    private String name;
    private Double price;

    public Optional<String> getName() {
        return Optional.of(this.name);
    }

    public Optional<Double> getPrice() {
        return Optional.of(this.price);
    }

}
