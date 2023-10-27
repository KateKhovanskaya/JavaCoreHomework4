package org.example.exceptions;

public class WrongPasswordException extends FormException{
    public WrongPasswordException() {
        super();
    }
    public WrongPasswordException(String message) {
        super(message);
    }
}
