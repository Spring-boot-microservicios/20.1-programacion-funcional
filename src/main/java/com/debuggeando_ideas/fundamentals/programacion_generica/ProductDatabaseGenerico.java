package com.debuggeando_ideas.fundamentals.programacion_generica;

import java.util.List;

public class ProductDatabaseGenerico implements DatabaseServiceGenerico<ProductGenerico> {

    @Override
    public ProductGenerico getById(Long id) {
        return new ProductGenerico(1L, "Galletas", 20.0);
    }

    @Override
    public List<ProductGenerico> getAll() {
        return List.of(
            new ProductGenerico(1L, "Galletas", 20.0),
            new ProductGenerico(2L, "Café", 154.00)
        );
    }

}
