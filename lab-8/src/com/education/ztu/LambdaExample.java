package com.education.ztu;

import java.util.function.Predicate;

public class LambdaExample {
    public static void main(String[] args) {
        Predicate<String> isNumeric = str -> {
            try {
                Integer.parseInt(str);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        };

        // Перевірка з and()
        Predicate<String> isValidNumber = isNumeric.and(str -> str.length() > 0);

        System.out.println(isValidNumber.test("123")); // true
        System.out.println(isValidNumber.test("abc")); // false
    }
}
