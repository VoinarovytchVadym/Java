package com.education.ztu;

import java.util.regex.*;

public class RegularExpressionExample {
    public static void main(String[] args) {
        String text = "1. Іванов Іван Іванович, 30 років, Програміст, досвід 5 років, адреса: вул. Лесі Українки, email: ivanov@mail.com, телефон: 0981234567\n" +
                      "2. Петров Петро Петрович, 25 років, Менеджер, досвід 3 роки, адреса: вул. Шевченка, email: petrov@mail.com, телефон: 0971234567\n" +
                      "3. Сидоренко Ольга Миколаївна, 28 років, Дизайнер, досвід 4 роки, адреса: вул. Тараса Шевченка, email: sidorenko@mail.com, телефон: 0631234567\n";

        // Регулярні вирази для пошуку емайлів та телефонів
        String emailRegex = "[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}";
        String phoneRegex = "\\d{3}\\d{3}\\d{4}";

        // Пошук емайлів
        Pattern emailPattern = Pattern.compile(emailRegex);
        Matcher emailMatcher = emailPattern.matcher(text);
        System.out.println("Emails found:");
        while (emailMatcher.find()) {
            System.out.println(emailMatcher.group());
        }

        // Пошук телефонів
        Pattern phonePattern = Pattern.compile(phoneRegex);
        Matcher phoneMatcher = phonePattern.matcher(text);
        System.out.println("\nPhones found:");
        while (phoneMatcher.find()) {
            System.out.println(phoneMatcher.group());
        }

        // Зміна формату дат народження
        String dateRegex = "(\\d{2})\\.(\\d{2})\\.(\\d{4})";
        String updatedText = text.replaceAll(dateRegex, "$3-$2-$1");
        System.out.println("\nUpdated text with changed dates:");
        System.out.println(updatedText);
    }
}
