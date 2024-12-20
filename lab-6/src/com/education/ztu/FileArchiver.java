package com.education.ztu;

import java.io.*;
import java.util.zip.*;

public class FileArchiver {
    public static void createArchive(String sourceDirectory, String archiveName) {
        try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(archiveName))) {
            File dir = new File(sourceDirectory);
            for (File file : dir.listFiles()) {
                try (FileInputStream fis = new FileInputStream(file)) {
                    zos.putNextEntry(new ZipEntry(file.getName()));
                    byte[] buffer = new byte[1024];
                    int bytesRead;
                    while ((bytesRead = fis.read(buffer)) != -1) {
                        zos.write(buffer, 0, bytesRead);
                    }
                    zos.closeEntry();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readArchive(String archiveName) {
        try (ZipInputStream zis = new ZipInputStream(new FileInputStream(archiveName))) {
            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null) {
                System.out.println("File in archive: " + entry.getName());
                zis.closeEntry();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String sourceDirectory = "directory_for_files";
        String archiveName = "directory_for_files.zip";

        createArchive(sourceDirectory, archiveName);
        readArchive(archiveName);
    }
}

