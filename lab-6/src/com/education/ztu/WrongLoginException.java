package com.education.ztu;

public class WrongLoginException extends Exception {
    public WrongLoginException() {
        super("Login is invalid.");
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
