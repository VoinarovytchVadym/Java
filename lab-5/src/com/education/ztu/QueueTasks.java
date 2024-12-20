package com.education.ztu;

import java.util.*;

public class QueueTasks {
    public static void main(String[] args) {
        Deque<Product> deque = new ArrayDeque<>();

        // Adding elements
        deque.push(new Product("Shirt", 30.99));
        deque.offerLast(new Product("Pants", 60.50));
        deque.offerLast(new Product("Shoes", 100.00));

        // Output first and last elements
        System.out.println("First product: " + deque.getFirst());
        System.out.println("Last product: " + deque.peekLast());

        // Poll and remove
        System.out.println("Removed first product: " + deque.pollFirst());
        System.out.println("Removed last product: " + deque.removeLast());
        System.out.println("Remaining deque: " + deque);

        deque.push(new Product("Jacket", 120.00));
        System.out.println("Popped: " + deque.pop());
    }
}