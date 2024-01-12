package ru.geekbrains.junior.homework2.homeTask1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Program1 {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Animal[] animals = new Animal[4];
        animals[0] = new Dog("Bobik", 1.2, 0.8, "Овчарка");
        animals[1] = new Dog("Sharik", 2, 0.5, "Шарпей");
        animals[2] = new Cat("Barsik", 0.5, "Gray");
        animals[3] = new Cat("Murka", 1.0, "White");

        for (Animal animal:animals) {
            Class clazz = animal.getClass();
            Field[] fields = clazz.getDeclaredFields();
            Method[] methods = clazz.getDeclaredMethods();
            System.out.println("Класс объекта: " + clazz.getName());
            System.out.println("Поля обекта:");
            for (Field field:fields) {
                System.out.println(field.getName() + ": " + field.get(animal));
            }
            System.out.println("Доступные методы: ");
            for (Method method: methods) {
                String methodName = method.getName();
                System.out.println(methodName);
                if (methodName == "makeSound"){
                    method.invoke(animal);
                }
            }
            System.out.println("-------------------");
        }
    }
}
