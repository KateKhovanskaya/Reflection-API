package ru.geekbrains.junior.homework2.homeTask1;

public class Cat extends Animal{
    String name;
    double age;
    String color;

    public Cat(String name, double age, String color) {
        this.color = color;
        this.name = name;
        this.age = age;
    }

    public void goEating(){
        System.out.println("Бегу кушать!");
    }
}
