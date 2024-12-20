package com.education.ztu;

import java.util.Scanner;

public class ReaderPrinter {
    private static final Object lock = new Object();
    private static String sharedData;

    static class Reader extends Thread {
        @Override
        public void run() {
            try (Scanner scanner = new Scanner(System.in)) {
                while (true) {
                    synchronized (lock) {
                        sharedData = scanner.nextLine();
                        lock.notify();
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    static class Printer extends Thread {
        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
                    try {
                        lock.wait();
                        System.out.println(sharedData);
                        lock.notify();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Reader reader = new Reader();
        Printer printer = new Printer();
        
        reader.start();
        printer.start();
    }
}
