package com.comarch.szkolenia.dziedziczenie;

public class Mammal extends Pet {
    private String name;
    private String breed;

    public Mammal(String name) {
        super();
        System.out.println("Konstruktor ssaka !!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void walk() {
        System.out.println("Ide na czterech lapach !!");
    }
}
