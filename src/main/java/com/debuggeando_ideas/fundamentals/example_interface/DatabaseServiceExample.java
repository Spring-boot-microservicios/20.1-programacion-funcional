package com.debuggeando_ideas.fundamentals.example_interface;

import java.util.List;

public interface DatabaseServiceExample {
    String getById(Long id);
    List<String> getAll();
}
