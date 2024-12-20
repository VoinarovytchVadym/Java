package com.education.ztu;

import java.util.*;
import java.util.concurrent.*;

public class SumCalculator {

    public static long calculateSum(int[] array) {
        long sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = new int[1000000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        // Однопоточний розрахунок
        long startTime = System.nanoTime();
        long sumSingleThread = calculateSum(array);
        long endTime = System.nanoTime();
        System.out.println("Single thread sum: " + sumSingleThread);
        System.out.println("Single thread execution time: " + (endTime - startTime) / 1_000_000 + "ms");

        // Багатопоточний розрахунок
        ExecutorService executor = Executors.newFixedThreadPool(5);
        long multiThreadStartTime = System.nanoTime();
        List<Future<Long>> futures = new ArrayList<>();
        int chunkSize = array.length / 5;

        for (int i = 0; i < 5; i++) {
            final int start = i * chunkSize;
            final int end = (i == 4) ? array.length : (i + 1) * chunkSize;

            futures.add(executor.submit(() -> {
                long sum = 0;
                for (int j = start; j < end; j++) {
                    sum += array[j];
                }
                return sum;
            }));
        }

        long multiThreadSum = 0;
        for (Future<Long> future : futures) {
            try {
                multiThreadSum += future.get();
            } catch (Exception e) {
                System.err.println("Error while retrieving future result: " + e.getMessage());
                e.printStackTrace();
            }
        }

        long multiThreadEndTime = System.nanoTime();
        System.out.println("Multi thread sum: " + multiThreadSum);
        System.out.println("Multi thread execution time: " + (multiThreadEndTime - multiThreadStartTime) / 1_000_000 + "ms");

        // Перевірка відповідності результатів
        if (sumSingleThread == multiThreadSum) {
            System.out.println("Both sums match!");
        } else {
            System.out.println("Error: Sums do not match!");
        }

        executor.shutdown();
    }
}
