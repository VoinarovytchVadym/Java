package com.education.ztu;

import java.util.Scanner;

public class Task6 {

    public static int[] generateFibonacci(int n) {
        int[] fibonacci = new int[n];
        if (n > 0) {
            fibonacci[0] = 1; 
        }
        if (n > 1) {
            fibonacci[1] = 1;  
        }
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }

    public static int[] reverseArray(int[] array) {
        int n = array.length;
        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = array[n - 1 - i];
        }
        return reversed;
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть кількість елементів у послідовності Фібоначчі:");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Кількість елементів повинна бути більшою за 0.");
        } else {
            int[] fibonacciArray = generateFibonacci(n);

            int[] reversedFibonacciArray = reverseArray(fibonacciArray);

            System.out.println("Послідовність Фібоначчі:");
            printArray(fibonacciArray);

            System.out.println("Зворотна послідовність Фібоначчі:");
            printArray(reversedFibonacciArray);
        }

        scanner.close();
    }
}
