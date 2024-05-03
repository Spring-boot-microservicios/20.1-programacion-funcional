package com.debuggeando_ideas.fundamentals.programacion_generica;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductGenerico {
    private Long id;
    private String name;
    private Double price;
}
