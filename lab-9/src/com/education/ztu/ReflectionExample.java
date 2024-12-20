package com.education.ztu;

import java.lang.reflect.*;

public class ReflectionExample {
    private String name;
    private int age;

    public ReflectionExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    public static void main(String[] args) throws Exception {
        // Отримання Class об'єкта
        Class<?> clazz = Class.forName("com.education.ztu.ReflectionExample");

        // Отримання всіх полів
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Field: " + field.getName() + ", Type: " + field.getType());
        }

        // Отримання всіх методів
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Method: " + method.getName() + ", Return type: " + method.getReturnType());
        }

        // Отримання всіх конструкторів
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("Constructor: " + constructor.getName());
        }

        // Створення екземпляра класу
        Constructor<?> constructor = clazz.getConstructor(String.class, int.class);
        Object obj = constructor.newInstance("John Doe", 30);

        // Виклик методу класу
        Method printInfoMethod = clazz.getMethod("printInfo");
        printInfoMethod.invoke(obj);

        // Виклик приватного методу
        Method privateMethod = clazz.getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true);
        privateMethod.invoke(obj);
    }
}
