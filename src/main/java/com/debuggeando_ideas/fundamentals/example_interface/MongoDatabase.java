package com.debuggeando_ideas.fundamentals.example_interface;

import java.util.List;

public class MongoDatabase implements DatabaseServiceExample {

    @Override
    public String getById(Long id) {
        return "Getting data from Mongo with id: " + id;
    }

    @Override
    public List<String> getAll() {
        return List.of("Hello World from mongo");
    }

}
