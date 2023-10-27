package org.example.exceptions;

public class FormException extends RuntimeException{

    public FormException() {
        super();
    }
    public FormException(String message) {
        super(message);
    }
}
