package com.debuggeando_ideas.complejidad_ciclomatica;

import java.util.List;

// T -> tipo de objeto a validar
// E -> tipo de excepcion a realizar
@FunctionalInterface
public interface Validator<T, E extends Exception> {

    void validate(T target) throws E;

    static <T, E extends Exception> void applyRules(List<Validator<T, E>> rules, T target) throws E {

        for (Validator<T, E> rule: rules) {
            rule.validate(target);
        }

    }

}
