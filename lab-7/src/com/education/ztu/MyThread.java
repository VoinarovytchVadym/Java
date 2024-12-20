package com.education.ztu;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Я люблю програмувати!!!");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        
        // Запуск потоку
        thread.start();

        // Виведення інформації про потік
        System.out.println("Thread name: " + thread.getName());
        System.out.println("Thread priority: " + thread.getPriority());
        System.out.println("Is thread alive? " + thread.isAlive());
        System.out.println("Is thread a daemon? " + thread.isDaemon());

        // Зміна імені та пріоритету потоку
        thread.setName("Programming Thread");
        thread.setPriority(Thread.MAX_PRIORITY);

        System.out.println("Updated thread name: " + thread.getName());
        System.out.println("Updated thread priority: " + thread.getPriority());

        // Чекаємо на завершення потоку
        thread.join();

        // Виведення інформації про головний потік
        System.out.println("Main thread name: " + Thread.currentThread().getName());
        System.out.println("Main thread priority: " + Thread.currentThread().getPriority());
    }
}
