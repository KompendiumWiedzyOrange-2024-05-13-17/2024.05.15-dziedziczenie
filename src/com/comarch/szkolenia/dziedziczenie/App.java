package com.comarch.szkolenia.dziedziczenie;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Reksio");
        dog.setBreed("Kundel");

        System.out.println(dog.getName());
        System.out.println(dog.getBreed());

        dog.breath();

        Cat cat = new Cat();
        cat.setName("Puszek");
        cat.setBreed("Dachowiec");
        cat.setAge(10);

        System.out.println(cat.getName());
        System.out.println(cat.getBreed());
        System.out.println(cat.getAge());

        cat.breath();
        cat.walk();

        System.out.println("--------------------");
        Snake snake = new Snake();
        //snake.walk();

        Mammal mammal = new Snake();
        Pet pet = new Snake();

        if(pet instanceof Snake) {
            Snake snake2 = (Snake) pet;
            snake2.walk();
            snake2.breath();
            snake2.setName("Jakis");
        }

        Mammal[] mammals = new Mammal[10];
        mammals[0] = new Snake();
        mammals[1] = new Dog();
        mammals[2] = new Cat();

        mammals[0].walk();
        mammals[1].walk();
        mammals[2].walk();

        Client client = new Client();

        Object[] objects = new Object[10];
        objects[0] = new Snake();
        objects[1] = new Client();
        objects[2] = new Cat();
        objects[3] = new Random();
    }
}
