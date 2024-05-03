package com.debuggeando_ideas.lambdas.expresion_lambda;

@FunctionalInterface
public interface MathLambda {

    // Tiene que tener una sola clase abstracta
    Double execute(Double a, Double b);

    // Metodo default
    default Double sum(Double a, Double b) {
        return a + b;
    }

}
