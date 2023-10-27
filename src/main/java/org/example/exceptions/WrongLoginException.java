package org.example.exceptions;

public class WrongLoginException extends FormException{
    public WrongLoginException(){
        super();
    }
    public WrongLoginException(String message){
        super(message);
    }
}
