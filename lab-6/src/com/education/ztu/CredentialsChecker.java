package com.education.ztu;

public class CredentialsChecker {
    public static boolean checkCredentials(String login, String password, String confirmPassword) {
        try {
            // Перевірка логіну
            if (!login.matches("[a-zA-Z0-9_]{1,20}")) {
                throw new WrongLoginException("Login must contain only Latin letters, digits, and underscores, and must be less than 20 characters.");
            }

            // Перевірка паролю
            if (!password.matches("[a-zA-Z0-9_]{1,20}") || !password.equals(confirmPassword)) {
                throw new WrongPasswordException("Password must contain only Latin letters, digits, and underscores, and be less than 20 characters.");
            }

            return true;

        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public static void main(String[] args) {
        String login = "user_123";
        String password = "pass_123";
        String confirmPassword = "pass_123";

        System.out.println("Credentials are valid: " + checkCredentials(login, password, confirmPassword));
    }
}
