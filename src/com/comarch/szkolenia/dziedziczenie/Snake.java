package com.comarch.szkolenia.dziedziczenie;

public class Snake extends Mammal {

    public Snake() {
        super("Pyton");
        System.out.println("Konstruktor weza !!");
    }

    @Override
    public void walk() {
        System.out.println("Pelzam !!");
    }

    @Override
    public void setName(String name) {
        System.out.println("Ustawiam imie !!");
        super.setName(name);
    }
}
