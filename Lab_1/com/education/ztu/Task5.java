package com.education.ztu;

import java.util.Scanner;

public class Task5 {

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10; 
            number /= 10;       
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть ціле додатне число:");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Будь ласка, введіть додатне число.");
        } else {
            int result = sumOfDigits(num);

            System.out.println("Сума цифр числа: " + result);
        }

        scanner.close();
    }
}
