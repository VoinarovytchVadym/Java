package com.education.ztu;

public class ArithmeticProgressionSyncBlock implements Runnable {
    private static int result = 1;

    @Override
    public void run() {
        synchronized (ArithmeticProgressionSyncBlock.class) {
            for (int i = 0; i < 100; i++) {
                System.out.print(result + " ");
                result++;
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new ArithmeticProgressionSyncBlock());
        Thread thread2 = new Thread(new ArithmeticProgressionSyncBlock());
        Thread thread3 = new Thread(new ArithmeticProgressionSyncBlock());

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
