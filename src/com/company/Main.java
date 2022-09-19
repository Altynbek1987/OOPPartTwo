package com.company;

import com.company.animal.Cat;
import com.company.animal.Dog;
import com.company.figure.Circle;
import com.company.figure.Rectangle;
import com.company.figure.Square;
import com.company.figure.Triangle;
import com.company.interf.Drawable;
import com.company.interf.SoundProducable;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle("Circle", 5);

        Triangle triangle = new Triangle("Triangle", 5, 5, 5);

        Square square = new Square("Square", 5);

        Rectangle rectangle = new Rectangle("Rectangle", 10, 5);

        Figure[] figures = {circle, triangle, square, rectangle};

        for (Figure figure: figures) {
            System.out.println(figure.getName() + ": " + figure.calculatePerimeter());
        }
        System.out.println("____________________________________________________________");

        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].getName() + ": " + figures[i].calculatePerimeter());
        }

        System.out.println("_____________________________________________________________");

        Dog dog = new Dog("Sabaken");
        Cat cat = new Cat("Coshka");

        Drawable[] drawables = {circle, triangle, square, rectangle,dog,cat};
        for (Drawable drawable:drawables) {
            if (drawable instanceof Figure){
                System.out.println(((Figure) drawable).getName() + " " + ((Figure)drawable).calculatePerimeter());
            }
            else if (drawable instanceof Animal){
                System.out.println(((Animal) drawable).getName());
            }
            drawable.draw();
            SoundProducable[] soundProducables = {dog,cat};
            for (SoundProducable soundProducable:soundProducables) {
                soundProducable.callSound();
            }
        }

    }
}
