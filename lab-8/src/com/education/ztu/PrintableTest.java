package com.education.ztu;

public class PrintableTest {
    public static void main(String[] args) {
        Printable printable = () -> System.out.println("Printing message using lambda expression!");
        printable.print();
    }
}
