package com.debuggeando_ideas.util_function.paquete_functions.function;

import com.debuggeando_ideas.util_function.curso_04.Person;

import java.io.*;
import java.util.Arrays;
import java.util.function.Function;

public class FunctionExample2 {

    // Recibe Persona
    // Regresa un arreglo de binario ByteArrayOutputStream
    static Function<Person, ByteArrayOutputStream> serializer = p -> {
        // Ceros y unos guardados en memoria
        ByteArrayOutputStream inMemoryBytes = new ByteArrayOutputStream();

        try (ObjectOutputStream outputStream = new ObjectOutputStream(inMemoryBytes)) {
            outputStream.writeObject(p);
            outputStream.flush();
        } catch (IOException ioe) {
            System.err.println("Error serializer: " + ioe.getMessage());
        }

        return inMemoryBytes;
    };

    static Function<ByteArrayInputStream, Person> deserializer = bais -> {

        try (ObjectInputStream objectInputStream = new ObjectInputStream(bais)) {
            return (Person) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error deserializer: " + e.getMessage());
            throw new RuntimeException("Error deserializer: " + e.getMessage());
        }

    };

    public static void main(String[] args) {

        ByteArrayOutputStream objectSerialized = serializer.apply(new Person("Max", 29));
        System.out.println("objectSerialized: " + Arrays.toString(objectSerialized.toByteArray()));

        Person objectDeserialized = deserializer.apply(new ByteArrayInputStream(objectSerialized.toByteArray()));
        System.out.println("objectDeserialized: " + objectDeserialized);

    }

}
