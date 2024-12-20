package com.education.ztu;

import java.time.LocalDateTime;

public class DateTasks {
    public static void main(String[] args) {
        // Створення об'єкта з поточною датою та часом
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("День тижня: " + currentDateTime.getDayOfWeek());
        System.out.println("День у році: " + currentDateTime.getDayOfYear());
        System.out.println("Місяць: " + currentDateTime.getMonth());
        System.out.println("Рік: " + currentDateTime.getYear());
        System.out.println("Час: " + currentDateTime.getHour() + ":" + currentDateTime.getMinute() + ":" + currentDateTime.getSecond());

        // Перевірка, чи рік високосний
        boolean isLeapYear = currentDateTime.toLocalDate().isLeapYear();
        System.out.println("Високосний рік: " + isLeapYear);
        
        // Порівняння дат
        LocalDateTime labStartTime = LocalDateTime.of(2024, 11, 29, 9, 0); // Початок лабораторної
        System.out.println("Чи поточний час після початку лабораторної? " + currentDateTime.isAfter(labStartTime));
    }
}
