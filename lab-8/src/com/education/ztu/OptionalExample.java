package com.education.ztu;

import java.util.Optional;
import java.util.Arrays;


public class OptionalExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Знаходження максимального значення
        Optional<Integer> max = Arrays.stream(numbers)
            .boxed()
            .max(Integer::compareTo);

        System.out.println("Max value: " + max.orElseThrow(() -> new IllegalArgumentException("Числа відсутні")));
    }
}
