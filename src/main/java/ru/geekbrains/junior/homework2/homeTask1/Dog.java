package ru.geekbrains.junior.homework2.homeTask1;

public class Dog extends Animal{
    String name;
    double age;
    double height;
    String breed;

    public Dog(String name, double age, double height, String breed) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.breed = breed;
    }
    public void makeSound(){
        System.out.println("Гав");
    }
}
