package com.debuggeando_ideas.reference_methods.referencias;

import lombok.ToString;

import java.util.Random;
import java.util.UUID;
import java.util.function.Supplier;

public class MetodoReferenciadoPorConstructor {

    public static void main(String[] args) {

        Supplier<MyObjectExample> myObjectExampleSupplier = () -> new MyObjectExample();
        System.out.println("myObjectExampleSupplier: " + myObjectExampleSupplier.get());

        // Metodo refenciado a constructor
        Supplier<MyObjectExample> myObjectExampleSupplierWithReferenceConstructor = MyObjectExample::new;
        System.out.println("myObjectExampleSupplierWithReferenceConstructor: " + myObjectExampleSupplier.get());

    }

}

@ToString
class MyObjectExample {

    private String string;
    private Integer num;

    public MyObjectExample() {
        this.string = UUID.randomUUID().toString();
        this.num = new Random().nextInt(1000);
    }

}