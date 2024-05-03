package com.debuggeando_ideas.fundamentals.example;

public class AppExample {

    public static void main(String[] args) {
        DatabaseServiceExample mongo = new MongoDatabase();
        DatabaseServiceExample postgres = new PostgresDatabase();

        System.out.println("Mongo: " + mongo.getById(20L));
        System.out.println("Postgresl: " + postgres.getById(40L));
    }
}
