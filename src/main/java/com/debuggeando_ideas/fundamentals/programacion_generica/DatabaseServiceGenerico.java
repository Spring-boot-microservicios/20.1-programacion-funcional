package com.debuggeando_ideas.fundamentals.programacion_generica;

import java.util.List;

// PARAMETROS DE TIPO
// E => Elemento (List<>)
// K => Llave (HasMap())
// N => Numeros (retorna un numero int, long)
// T => un tipo (un modelo)
// V => un valor (HasMap())
public interface DatabaseServiceGenerico<T> {
    T getById(Long id);
    List<T> getAll();
}
