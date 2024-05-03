package com.debuggeando_ideas.fundamentals.programacion_generica;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmployeeGenerico {
    private String dni;
    private String name;
    private Double salary;
}
