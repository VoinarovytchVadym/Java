package com.education.ztu;

import java.util.Formatter;

public class FormatterTask {

    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        
        // Форматуємо чек
        formatter.format("Дата та час покупки: %1$td.%1$tm.%1$ty %1$tH:%1$tM:%1$tS\n", java.time.LocalDateTime.now());
        formatter.format("===========================================\n");
        formatter.format("№ Товар           Категорія           Ціна\n");
        formatter.format("===========================================\n");
        formatter.format("1. Джинси         Жіночий одяг        1500,78 ₴\n");
        formatter.format("2. Спідниця       Жіночий одяг        1000,56 ₴\n");
        formatter.format("3. Краватка       Чоловічий одяг      500,78 ₴\n");
        formatter.format("===========================================\n");
        formatter.format("Разом:            3002,34 ₴\n");
        
        System.out.println(formatter.toString());
        formatter.close();
    }
}
