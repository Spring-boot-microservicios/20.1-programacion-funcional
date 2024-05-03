package com.debuggeando_ideas.fundamentals.programacion_generica;

public class AppGenerico {

    public static void main(String[] args) {
        ProductDatabaseGenerico productDatabaseGenerico = new ProductDatabaseGenerico();
        EmployeeDatabaseGenerico employeeDatabaseGenerico = new EmployeeDatabaseGenerico();

        System.out.println("Product: " + productDatabaseGenerico.getById(10L));
        System.out.println("Employeed: " + employeeDatabaseGenerico.getById(30L));
    }
}
