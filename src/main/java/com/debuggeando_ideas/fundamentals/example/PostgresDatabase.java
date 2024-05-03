package com.debuggeando_ideas.fundamentals.example;

import java.util.List;

public class PostgresDatabase implements DatabaseServiceExample {

    @Override
    public String getById(Long id) {
        return "Getting data from Postgres with id: " + id;
    }

    @Override
    public List<String> getAll() {
        return List.of("Hello World from postgres");
    }

}
