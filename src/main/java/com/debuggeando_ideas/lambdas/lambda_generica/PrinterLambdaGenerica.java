package com.debuggeando_ideas.lambdas.lambda_generica;

@FunctionalInterface
public interface PrinterLambdaGenerica<T> {

    void print(T toPrint);

}
