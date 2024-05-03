package com.debuggeando_ideas.lambdas.lambda_scope;

import com.debuggeando_ideas.fundamentals.programacion_generica.ProductGenerico;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;

public class AppLambdaScope {

    public static void main(String[] args) {

        // No se puede realizar ya que la variable esta fuera del scope
        // de la lambda..

        // int number = 10;
        // IntStream.range(1, 10).forEach(num -> number = number + num);

        // Darle acceso al scope de la lambda por medio de atomic
        AtomicInteger number = new AtomicInteger(10);
        IntStream.range(1, 10).forEach(num -> number.set(number.get() + num));

        System.out.println("Incrementado: " + number.get());

        AtomicReference<ProductGenerico> productGenericoAtomicReference = new AtomicReference<>(new ProductGenerico());

        IntStream.range(1, 20).forEach(id ->
            System.out.println("productGenericoAtomicReference: " +
                productGenericoAtomicReference.getAndSet(new ProductGenerico((long) id, "Test " + id, (10.0 * id)))
            )
        );

    }

}
