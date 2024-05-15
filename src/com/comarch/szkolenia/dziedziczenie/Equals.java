package com.comarch.szkolenia.dziedziczenie;

public class Equals {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;

        System.out.println(a == b);

        Client c1 = new Client();
        c1.setAge(10);
        c1.setName("Karol");
        c1.setSurname("Kowalski");

        Client c2 = c1;

        System.out.println(c1 == c2);

        String s1 = "Ok";
        String s2 = new String("Ok");

        System.out.println(s1 == s2);

        System.out.println(c1);

        String string = c1.toString();
        System.out.println(string);

        String info = a == 5 ? "cos" : "cos innego";
        System.out.println(info);
    }
}
