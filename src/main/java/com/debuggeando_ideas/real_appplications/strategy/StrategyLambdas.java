package com.debuggeando_ideas.real_appplications.strategy;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;

public class StrategyLambdas {

    public static void main(String[] args) {

        Product product1 = Product.builder().id(1L).name("Bear").price(150.0).userType("BASIC").build();
        Product product2 = Product.builder().id(2L).name("Bear").price(150.0).userType("PLUS").build();
        Product product3 = Product.builder().id(3L).name("Bear").price(150.0).userType("PRIME").build();

        List<Product> products = List.of(product1, product2, product3);

        products.forEach(product -> {

            switch (product.getUserType()) {
                case "BASIC": product.setDiscountStrategy(Strategies.basicDiscount); break;
                case "PLUS": product.setDiscountStrategy(Strategies.plusDiscount); break;
                case "PRIME": product.setDiscountStrategy(Strategies.primeDiscount); break;
            }

        });

        products.forEach(product -> {
            System.out.println("Price: " + product.getPrice() +
                ", UserType: " + product.getUserType() +
                ", Discount: " + product.getDiscountStrategy().get(product.getPrice())
            );
        });

    }

}

@FunctionalInterface
interface ApplyDiscountStrategy {
    Double get(Double price);
}

@Data
@ToString
@Builder
class Product {
    private Long id;
    private String userType;
    private String name;
    private Double price;
    private ApplyDiscountStrategy discountStrategy;
}

class Strategies {
    static ApplyDiscountStrategy basicDiscount = p -> p * 0.02;
    static ApplyDiscountStrategy plusDiscount = p -> p * 0.05;
    static ApplyDiscountStrategy primeDiscount = p -> p * 0.08;
}

