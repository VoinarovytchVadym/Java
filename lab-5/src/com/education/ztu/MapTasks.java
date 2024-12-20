package com.education.ztu;

import java.util.*;

public class MapTasks {
    public static void main(String[] args) {
        Map<String, Product> productMap = new HashMap<>();

        // Adding key-value pairs
        productMap.put("Laptop", new Product("Laptop", 1200.50));
        productMap.put("Smartphone", new Product("Smartphone", 800.00));

        // Demonstrating methods
        System.out.println("Smartphone details: " + productMap.get("Smartphone"));
        productMap.putIfAbsent("Tablet", new Product("Tablet", 400.75));

        System.out.println("Contains key 'Laptop': " + productMap.containsKey("Laptop"));
        System.out.println("KeySet: " + productMap.keySet());
        System.out.println("Values: " + productMap.values());

        productMap.putAll(Map.of("Watch", new Product("Watch", 300.50), "Camera", new Product("Camera", 550.00)));

        for (Map.Entry<String, Product> entry : productMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        productMap.clear();
        System.out.println("Is map empty? " + productMap.isEmpty());
    }
}