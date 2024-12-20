package com.education.ztu;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super("Password is invalid.");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
