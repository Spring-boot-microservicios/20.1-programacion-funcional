package com.debuggeando_ideas.fundamentals.curso_01;

import java.util.List;

public interface DatabaseService<T> {

    T getById(Long id);
    List<T> getAllRecords();

}
