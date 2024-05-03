package com.debuggeando_ideas.fundamentals.programacion_generica;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductGenerico {
    private Long id;
    private String name;
    private Double price;
}
