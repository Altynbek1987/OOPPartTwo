package com.company.animal;

import com.company.Animal;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDC08");

    }

    @Override
    public void callSound() {
        System.out.println("Mya mya");
    }
}
