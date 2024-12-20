package com.education.ztu;

import java.io.*;

public class FileCopy {
    public static void copyFile(String sourceFilePath, String destinationFilePath) {
        try (FileInputStream fis = new FileInputStream(sourceFilePath);
             FileOutputStream fos = new FileOutputStream(destinationFilePath)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String sourceFile = "directory_for_files/source.txt";
        String destinationFile = "directory_for_files/destination.txt";
        copyFile(sourceFile, destinationFile);
    }
}
