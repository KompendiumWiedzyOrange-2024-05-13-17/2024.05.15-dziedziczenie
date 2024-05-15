package com.comarch.szkolenia.dziedziczenie;

public class Client {
    private String name;
    private String surname;
    private int age;

    public Client(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Client() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Client c) {
            return c.age == this.age && c.name.equals(this.name) && c.surname.equals(this.surname);
        }
        return false;
    }

    @Override
    public String toString() {
        return this.name + " " + this.surname + " Wiek: " + this.age;
    }
}
