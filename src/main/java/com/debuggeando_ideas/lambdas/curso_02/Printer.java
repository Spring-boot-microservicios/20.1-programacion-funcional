package com.debuggeando_ideas.lambdas.curso_02;

@FunctionalInterface
public interface Printer<T> {

    void print(T toPrint);
}
