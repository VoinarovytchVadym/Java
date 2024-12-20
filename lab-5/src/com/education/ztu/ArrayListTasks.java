package com.education.ztu;

import java.util.*;

public class CollectionsTasks {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(Arrays.asList(
                new Product("Shoes", 50.99),
                new Product("Shirt", 20.00),
                new Product("Hat", 15.99)
        ));

        // Demonstrating Collections.sort()
        Collections.sort(products, Comparator.comparingDouble(Product::getPrice));
        System.out.println("Sorted list: " + products);

        // Demonstrating Collections.binarySearch()
        int index = Collections.binarySearch(products, new Product("Shirt", 20.00), Comparator.comparingDouble(Product::getPrice));
        System.out.println("Index of Shirt: " + index);

        // Demonstrating Collections.reverse()
        Collections.reverse(products);
        System.out.println("Reversed list: " + products);

        // Demonstrating Collections.shuffle()
        Collections.shuffle(products);
        System.out.println("Shuffled list: " + products);

        // Demonstrating Collections.fill()
        Collections.fill(products, new Product("Default", 0.00));
        System.out.println("Filled list: " + products);

        // Demonstrating Collections.max() and Collections.min()
        System.out.println("Max price product: " + Collections.max(products, Comparator.comparingDouble(Product::getPrice)));
        System.out.println("Min price product: " + Collections.min(products, Comparator.comparingDouble(Product::getPrice)));

        // Demonstrating Collections.copy()
        List<Product> copyList = new ArrayList<>(Arrays.asList(
                new Product("Placeholder", 0.0),
                new Product("Placeholder", 0.0),
                new Product("Placeholder", 0.0)
        ));
        Collections.copy(copyList, products);
        System.out.println("Copied list: " + copyList);

        // Demonstrating Collections.rotate()
        Collections.rotate(products, 1);
        System.out.println("Rotated list: " + products);

        // Demonstrating Collections.checkedCollection()
        Collection<Product> checkedProducts = Collections.checkedCollection(products, Product.class);
        System.out.println("Checked collection: " + checkedProducts);

        // Demonstrating Collections.frequency()
        int frequency = Collections.frequency(products, new Product("Default", 0.00));
        System.out.println("Frequency of Default: " + frequency);

        // Adding diverse data to demonstrate other functionalities
        products = new ArrayList<>(Arrays.asList(
                new Product("Laptop", 1200.50),
                new Product("Smartphone", 800.00),
                new Product("Tablet", 400.75)
        ));
        System.out.println("Original list: " + products);
    }
}
