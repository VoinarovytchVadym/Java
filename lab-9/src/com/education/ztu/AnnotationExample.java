package com.education.ztu;

public class AnnotationExample {
    @MyAnnotation(description = "This is a test method", value = 2)
    public void testMethod() {
        System.out.println("Method executed.");
    }

    public static void main(String[] args) throws Exception {
        AnnotationExample example = new AnnotationExample();
        example.testMethod();

        // Отримання анотацій з методу
        MyAnnotation annotation = example.getClass().getMethod("testMethod").getAnnotation(MyAnnotation.class);
        System.out.println("Description: " + annotation.description());
        System.out.println("Value: " + annotation.value());
    }
}
