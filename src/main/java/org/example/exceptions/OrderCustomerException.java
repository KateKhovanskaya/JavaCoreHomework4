package org.example.exceptions;

public class OrderCustomerException extends OrderException{
    public OrderCustomerException() {
    }

    public OrderCustomerException(String message) {
        super(message);
    }
}
