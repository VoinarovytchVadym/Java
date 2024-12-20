package com.education.ztu;

import java.io.*;
import java.util.*;

public class ReportWriter {
    public static void writeReportToFile(String filePath, List<Product> products) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            writer.println("Purchase Report:");
            for (Product product : products) {
                writer.println(product);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readReportFromFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", 1200.50),
                new Product("Smartphone", 800.00)
        );
        String filePath = "directory_for_files/purchase_report.txt";

        writeReportToFile(filePath, products);
        readReportFromFile(filePath);
    }
}
