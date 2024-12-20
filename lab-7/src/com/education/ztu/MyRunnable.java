package com.education.ztu;

public class MyRunnable implements Runnable {
    private volatile boolean isRunning = true;

    @Override
    public void run() {
        for (int i = 0; i <= 10000; i++) {
            if (i % 10 == 0) {
                System.out.println(i);
            }

            if (!isRunning) {
                System.out.println("Розрахунок завершено!!!");
                break;
            }
        }
    }

    public void stopRunning() {
        isRunning = false;
    }

    public static void main(String[] args) throws InterruptedException {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);
        Thread thread3 = new Thread(myRunnable);

        thread1.start();
        thread2.start();
        thread3.start();

        // Затримка головного потоку
        Thread.sleep(2000);

        // Переривання потоків
        thread1.interrupt();
        thread2.interrupt();
        thread3.interrupt();
    }
}
