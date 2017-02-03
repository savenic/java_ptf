package ru.stqa.ptf.sandbox;

public class Myfp {
    public static void main(String[] args)
    {
        System.out.println("Hello, world!");

        Distance l = new Distance (1,2,4,6);
        System.out.println("Расстояние = " + l.l());
    }
}

