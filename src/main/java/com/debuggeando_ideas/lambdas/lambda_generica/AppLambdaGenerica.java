package com.debuggeando_ideas.lambdas.lambda_generica;

import com.debuggeando_ideas.fundamentals.programacion_generica.EmployeeGenerico;
import com.debuggeando_ideas.fundamentals.programacion_generica.ProductGenerico;
import com.debuggeando_ideas.lambdas.curso_02.Printer;

import java.util.UUID;

public class AppLambdaGenerica {

    public static void main(String[] args) {

        Printer<String> printerString = string -> System.out.println(string);
        printerString.print("Hola con mi print generico");

        Printer<ProductGenerico> printerProduct = product -> System.out.println(product);
        printerProduct.print(new ProductGenerico(10L, "Tablet", 23000.00));

        Printer<EmployeeGenerico> printerEmployee = employee -> System.out.println(employee);
        printerEmployee.print(new EmployeeGenerico(UUID.randomUUID().toString(), "Luisito", 240000.00));

        // JDK 14+
//        var result = switch("TRES") {
//            case "UNO" -> 1;
//            case "DOS" -> 2;
//            case "TRES" -> 3;
//            default -> 0;
//        };

    }

}
