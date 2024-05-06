package com.debuggeando_ideas.reference_methods.referencias;

import java.util.UUID;
import java.util.function.Supplier;

public class MetodoEstaticoReferenciado {

    public static void main(String[] args) {
        // System.out.println(UUID.randomUUID().toString());

        Supplier<UUID> getToken = () -> UUID.randomUUID();
        System.out.println("getToken: " + getToken.get());


        // Metodo referenciado de forma estatica
        Supplier<UUID> getTokenStaticMethodReference = UUID::randomUUID;
        System.out.println("getToken reference: " + getTokenStaticMethodReference.get());

    }

}
