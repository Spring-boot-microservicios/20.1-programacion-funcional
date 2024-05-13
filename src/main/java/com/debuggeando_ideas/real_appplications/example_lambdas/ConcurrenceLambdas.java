package com.debuggeando_ideas.real_appplications.example_lambdas;

import java.util.Calendar;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class ConcurrenceLambdas {

    // Hace un proceso en segundo plano y no regresa nada
    private static Runnable printerSum = () -> {
        long result = 0L;

        // Como un subproceso
        System.out.println("Hilo name: " + Thread.currentThread().getName()); // pool-1-thread-1

        for (int i = 0; i < 1000000; i++) {
            result += i;
        }

        System.out.println("Total: " + result);
    };

    // Hace un proceso en segundo plano y regresa un resultado
    private static Callable<Long> getSum = () -> {
        long result = 0L;

        // Como un subproceso
        System.out.println("Hilo name: " + Thread.currentThread().getName());

        for (int i = 0; i < 1000000; i++) {
            result += i;
        }

        return result;
    };

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        System.out.println("Hilo name: " + Thread.currentThread().getName()); // main

        // newSingleThreadExecutor para hacer pruebas
        var exec = Executors.newSingleThreadExecutor();
        exec.submit(printerSum);

        var result = exec.submit(getSum);
        System.out.println("Result Callable: " + result.get());

        exec.shutdown(); // finalizar los hilos
    }

}
