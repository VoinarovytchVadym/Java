package com.education.ztu;

public class StringTask {

    public static void main(String[] args) {
        String str = "I learn Java!!!";
        
        // Останній символ рядка
        System.out.println("Останній символ: " + str.charAt(str.length() - 1));
        
        // Перевірка, чи закінчується рядок підрядком "!!!"
        System.out.println("Чи закінчується на '!!!': " + str.endsWith("!!!"));
        
        // Перевірка, чи починається рядок підрядком "I learn "
        System.out.println("Чи починається на 'I learn ': " + str.startsWith("I learn "));
        
        // Перевірка, чи містить рядок підрядок "Java"
        System.out.println("Чи містить 'Java': " + str.contains("Java"));
        
        // Знайти позицію підрядка "Java"
        System.out.println("Позиція підрядка 'Java': " + str.indexOf("Java"));
        
        // Замінити всі символи 'a' на 'o'
        System.out.println("Після заміни 'a' на 'o': " + str.replace('a', 'o'));
        
        // Перетворити рядок на верхній регістр
        System.out.println("Верхній регістр: " + str.toUpperCase());
        
        // Перетворити рядок на нижній регістр
        System.out.println("Нижній регістр: " + str.toLowerCase());
        
        // Вирізати підрядок "Java"
        System.out.println("Вирізати 'Java': " + str.replace("Java", ""));
    }
}
 