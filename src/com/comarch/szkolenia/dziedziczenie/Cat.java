package com.comarch.szkolenia.dziedziczenie;

public class Cat extends Mammal {
    int age;

    public Cat() {
        super("Cos");
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
