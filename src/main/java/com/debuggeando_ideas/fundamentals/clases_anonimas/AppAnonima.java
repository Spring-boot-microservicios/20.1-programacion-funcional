package com.debuggeando_ideas.fundamentals.clases_anonimas;

import com.debuggeando_ideas.fundamentals.programacion_generica.DatabaseServiceGenerico;
import com.debuggeando_ideas.fundamentals.programacion_generica.EmployeeGenerico;
import com.debuggeando_ideas.fundamentals.programacion_generica.ProductGenerico;

import java.util.List;

public class AppAnonima {

    public static void main(String[] args) {
        // Uso de elementos del paquete de programacion generica

        System.out.println(ProductGenerico.class.getName());
        System.out.println(EmployeeGenerico.class.getName());
        System.out.println(String.class.getName());

        // Resultados
//        com.debuggeando_ideas.fundamentals.programacion_generica.ProductGenerico
//        com.debuggeando_ideas.fundamentals.programacion_generica.EmployeeGenerico
//        java.lang.String

        // Implementando clase anonima
        DatabaseServiceGenerico<String> databaseAnonima = new DatabaseServiceGenerico<String>() {
            @Override
            public String getById(Long id) {
                return "";
            }

            @Override
            public List<String> getAll() {
                return List.of();
            }
        };

        System.out.println(databaseAnonima.getClass().getName());
        // No tiene nombre => com.debuggeando_ideas.fundamentals.clases_anonimas.AppAnonima$1
    }
}
