package com.debuggeando_ideas.reference_methods.curso_03;

import lombok.ToString;

import java.util.Random;
import java.util.UUID;

@ToString
public class MyObject {
    private  String string;
    private  Integer num;

    MyObject() {
        this.string = UUID.randomUUID().toString();
        this.num = new Random().nextInt(1000);
    }
}
