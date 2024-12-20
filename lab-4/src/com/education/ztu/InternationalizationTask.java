package com.education.ztu;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class InternationalizationTask {

    public static void main(String[] args) {
        System.out.println("Class loader path: " + InternationalizationTask.class.getClassLoader().getResource("").getPath());
        System.out.println(System.getProperty("user.dir"));
        Locale localeUA = new Locale("uk", "UA");
        Locale localeEN = new Locale("en", "US");
        Locale localeFR = new Locale("fr", "FR");
        
        ResourceBundle bundleUA = ResourceBundle.getBundle("data", localeUA);
        ResourceBundle bundleEN = ResourceBundle.getBundle("data", localeEN);
        ResourceBundle bundleFR = ResourceBundle.getBundle("data", localeFR);

        NumberFormat currencyFormatUA = NumberFormat.getCurrencyInstance(localeUA);
        NumberFormat currencyFormatEN = NumberFormat.getCurrencyInstance(localeEN);
        NumberFormat currencyFormatFR = NumberFormat.getCurrencyInstance(localeFR);

        System.out.println("Ukraine:");
        printReceipt(bundleUA, currencyFormatUA);

        System.out.println("\nEnglish:");
        printReceipt(bundleEN, currencyFormatEN);

        System.out.println("\nFrench:");
        printReceipt(bundleFR, currencyFormatFR);
    }

    private static void printReceipt(ResourceBundle bundle, NumberFormat currencyFormat) {
        System.out.println("Дата та час покупки: " + bundle.getString("date_format"));
        System.out.println("===========================================");
        System.out.println("№ Товар           Категорія           Ціна");
        System.out.println("===========================================");
        System.out.println("1. " + bundle.getString("product1") + "         " + bundle.getString("category1") + "        " + currencyFormat.format(Double.parseDouble(bundle.getString("price1"))));
        System.out.println("2. " + bundle.getString("product2") + "         " + bundle.getString("category1") + "        " + currencyFormat.format(Double.parseDouble(bundle.getString("price2"))));
        System.out.println("3. " + bundle.getString("product3") + "         " + bundle.getString("category2") + "        " + currencyFormat.format(Double.parseDouble(bundle.getString("price3"))));
        System.out.println("===========================================");
        System.out.println("Разом:            " + currencyFormat.format(Double.parseDouble(bundle.getString("total"))));
    }
}
