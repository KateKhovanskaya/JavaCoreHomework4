package org.example.exceptions;

public class OrderProductQuantatyException extends OrderException{
    public OrderProductQuantatyException() {
    }

    public OrderProductQuantatyException(String message) {
        super(message);
    }
}
