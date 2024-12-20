package com.education.ztu;

import java.util.*;

public class SetTasks {
    public static void main(String[] args) {
        TreeSet<Product> set = new TreeSet<>(Comparator.comparing(Product::getName));

        // Adding elements
        set.add(new Product("Socks", 5.99));
        set.add(new Product("Jacket", 120.50));
        set.add(new Product("Gloves", 12.99));

        // Demonstrating methods
        System.out.println("First product: " + set.first());
        System.out.println("Last product: " + set.last());
        System.out.println("HeadSet: " + set.headSet(new Product("Jacket", 120.50)));
        System.out.println("TailSet: " + set.tailSet(new Product("Gloves", 12.99)));
        System.out.println("SubSet: " + set.subSet(new Product("Gloves", 12.99), new Product("Socks", 5.99)));

        // Poll and descending set
        System.out.println("Poll first: " + set.pollFirst());
        System.out.println("Poll last: " + set.pollLast());
        System.out.println("Descending set: " + set.descendingSet());
    }
}