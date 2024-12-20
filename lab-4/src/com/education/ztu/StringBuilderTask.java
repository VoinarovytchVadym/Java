package com.education.ztu;

public class StringBuilderTask {

    public static void main(String[] args) {
        int a = 4;
        int b = 36;
        
        // Створюємо рядок за допомогою StringBuilder
        StringBuilder sb = new StringBuilder();
        
        // Операції з додаванням, відніманням та множенням
        sb.append(a).append(" + ").append(b).append(" = ").append(a + b);
        System.out.println(sb.toString());
        
        sb.setLength(0); // Очищаємо StringBuilder
        sb.append(a).append(" - ").append(b).append(" = ").append(a - b);
        System.out.println(sb.toString());
        
        sb.setLength(0); // Очищаємо StringBuilder
        sb.append(a).append(" * ").append(b).append(" = ").append(a * b);
        System.out.println(sb.toString());
        
        // Замінити символ "=" на "рівно"
        sb.setLength(0);
        sb.append(a).append(" + ").append(b).append(" = ").append(a + b);
        sb.replace(sb.indexOf("="), sb.indexOf("=") + 1, "рівно");
        System.out.println(sb.toString());
        
        // Зміна порядку символів
        sb.reverse();
        System.out.println("Перевернутий рядок: " + sb.toString());
        
        // Визначення довжини та capacity
        System.out.println("Довжина: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
    }
}
