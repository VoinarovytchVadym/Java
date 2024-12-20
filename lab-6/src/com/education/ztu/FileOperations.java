package com.education.ztu;

import java.io.*;

public class FileOperations {
    public static void main(String[] args) {
        // Створення папки
        File folder = new File("directory_for_files/inner_directory");
        if (!folder.exists()) {
            folder.mkdir();
        }

        // Абсолютний шлях
        System.out.println("Absolute path: " + folder.getAbsolutePath());

        // Ім’я батьківської директорії
        System.out.println("Parent directory: " + folder.getParent());

        // Створення файлів у папці
        try {
            new File(folder, "file1.txt").createNewFile();
            new File(folder, "file2.txt").createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Видалення файлу
        new File(folder, "file1.txt").delete();

        // Переіменування папки
        folder.renameTo(new File("directory_for_files/renamed_inner_directory"));

        // Виведення списку файлів у папці
        File[] files = new File("directory_for_files").listFiles();
        for (File file : files) {
            System.out.println(file.getName() + " - " + (file.isDirectory() ? "Directory" : "File"));
        }
    }
}
