package org.example.exceptions;

public class OrderProductNameException extends OrderException{
    public OrderProductNameException() {
    }

    public OrderProductNameException(String message) {
        super(message);
    }
}
