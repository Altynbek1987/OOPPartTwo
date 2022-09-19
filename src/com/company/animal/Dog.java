package com.company.animal;

import com.company.Animal;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDC15");

    }

    @Override
    public void callSound() {
        System.out.println("Gav gav");
    }
}
