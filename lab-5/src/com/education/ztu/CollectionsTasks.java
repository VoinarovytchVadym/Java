package com.education.ztu;

import java.util.*;

public class CollectionsTasks {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(Arrays.asList(
                new Product("Shoes", 50.99),
                new Product("Shirt", 20.00),
                new Product("Hat", 15.99)
        ));

        // Demonstrating methods
        Collections.sort(products, Comparator.comparingDouble(Product::getPrice));
        System.out.println("Sorted list: " + products);

        int index = Collections.binarySearch(products, new Product("Shirt", 20.00), Comparator.comparingDouble(Product::getPrice));
        System.out.println("Index of Shirt: " + index);

        Collections.reverse(products);
        System.out.println("Reversed list: " + products);

        Collections.shuffle(products);
        System.out.println("Shuffled list: " + products);

        Collections.fill(products, new Product("Default", 0.00));
        System.out.println("Filled list: " + products);

        System.out.println("Max price product: " + Collections.max(products, Comparator.comparingDouble(Product::getPrice)));
        System.out.println("Min price product: " + Collections.min(products, Comparator.comparingDouble(Product::getPrice)));

        List<Product> copyList = new ArrayList<>(products);
        Collections.copy(copyList, products);
        System.out.println("Copied list: " + copyList);

        Collections.rotate(products, 1);
        System.out.println("Rotated list: " + products);

        Collection<Product> checkedProducts = Collections.checkedCollection(products, Product.class);
        System.out.println("Checked collection: " + checkedProducts);

        System.out.println("Frequency of Default: " + Collections.frequency(products, new Product("Default", 0.00)));
    }
}
