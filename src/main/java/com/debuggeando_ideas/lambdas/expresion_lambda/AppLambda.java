package com.debuggeando_ideas.lambdas.expresion_lambda;

public class AppLambda {

    public static void main(String[] args) {

        // Clase anonima
        MathLambda substract = new MathLambda() {

            @Override
            public Double execute(Double a, Double b) {
                return a - b;
            }

        };

        System.out.println("Anonima substract: " + substract.execute(51.0, 8.0));

        // Expresion lambda
        MathLambda multiply = (a, b) -> a * b;
        System.out.println("Lambda multiply: " + multiply.execute(10.0, 8.0));

        MathLambda divide = (a, b) -> {
            System.out.println("Start");

            return a / b;
        };
        System.out.println("Lambda divide: " + divide.execute(6.0, 2.0));

        System.out.println("Lambda suma default: " + divide.sum(5.0, 5.0));

    }

}
