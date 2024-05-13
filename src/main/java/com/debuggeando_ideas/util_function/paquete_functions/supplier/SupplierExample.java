package com.debuggeando_ideas.util_function.paquete_functions.supplier;

import lombok.ToString;

import java.util.Random;
import java.util.function.Supplier;

// Lo contrario a consumer, ya que regresa un valor
// Probee de algun tipo de objeto
public class SupplierExample {

    // Numero random de 0 a 100
    private static Supplier<Integer> randomInt = () -> new Random().nextInt(100);

    private static Supplier<MyProduct> productSupplier = () -> new MyProduct(100, "Smartphone");

    public static void main(String[] args) {

        System.out.println("Random int 1: " + randomInt.get());
        System.out.println("Random int 2: " + randomInt.get());
        System.out.println("Random int 3: " + randomInt.get());

        System.out.println("productSupplier: " + productSupplier.get());

    }

}

@ToString
class MyProduct {
    Integer price;
    String name;

    public MyProduct(Integer price, String name) {
        this.price = price;
        this.name = name;
    }

}