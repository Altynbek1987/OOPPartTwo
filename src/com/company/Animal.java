package com.company;

import com.company.interf.Drawable;
import com.company.interf.SoundProducable;

public abstract class Animal implements Drawable, SoundProducable {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
