package com.education.ztu;

import java.util.*;

public class StreamExample {
    public static void main(String[] args) {
        List<PRoduct> products = Arrays.asList(
            new PRoduct("Laptop", "BrandA", 999.99, 5),
            new PRoduct("Smartphone", "BrandB", 499.99, 10)
        );

        // Використання посилання на метод замість виклику Product::getBrand
        products.stream()
            .map(PRoduct::getBrand)
            .forEach(System.out::println);
    }
}
