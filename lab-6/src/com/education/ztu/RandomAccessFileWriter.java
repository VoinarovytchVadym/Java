package com.education.ztu;

import java.io.*;

public class RandomAccessFileWriter {
    public static void writeToFile(String filePath) {
        try (RandomAccessFile file = new RandomAccessFile(filePath, "rw")) {
            file.writeBytes("Product 1: Laptop\n");
            file.writeBytes("Product 2: Smartphone\n");

            // Переміщення курсора та запис додаткових даних
            file.seek(file.length());
            file.writeBytes("Product 3: Tablet\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String filePath = "directory_for_files/product_list.txt";
        writeToFile(filePath);
    }
}
