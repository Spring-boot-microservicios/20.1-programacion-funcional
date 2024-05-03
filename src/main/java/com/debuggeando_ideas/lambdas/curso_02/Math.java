package com.debuggeando_ideas.lambdas.curso_02;

@FunctionalInterface
public interface Math {

    Double excecute(Double a, Double b);

    default Double sum(Double a, Double b) { return  a + b; }
}
