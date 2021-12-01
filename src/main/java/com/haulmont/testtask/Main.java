package com.haulmont.testtask;

public class Main {
    public static void main(String[] args) {
        Patient p1 = new Patient(
                "Петров", "Андрей", "Абрамович", "+7197000000", 1.00);

        Doctor d1 = new Doctor(
                "Фигуля", "Виктор", "Моисеевич", "хирург");

        System.out.println(p1);
        System.out.println("________________________");
        System.out.println(d1);
        System.out.println("________________________");
        d1.takeRecipe(p1,"Аспирин 2 раза в день", 10,"normal");


    }
}
