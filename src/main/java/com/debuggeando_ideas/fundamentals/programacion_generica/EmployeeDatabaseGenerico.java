package com.debuggeando_ideas.fundamentals.programacion_generica;

import java.util.List;
import java.util.UUID;

public class EmployeeDatabaseGenerico implements DatabaseServiceGenerico<EmployeeGenerico> {

    @Override
    public EmployeeGenerico getById(Long id) {
        return new EmployeeGenerico(
            UUID.randomUUID().toString(),
            "Luis",
            10000.00
        );
    }

    @Override
    public List<EmployeeGenerico> getAll() {
        return List.of(
            new EmployeeGenerico(UUID.randomUUID().toString(), "Luis", 10000.00),
            new EmployeeGenerico(UUID.randomUUID().toString(), "Angel", 1514545.54)
        );
    }

}
