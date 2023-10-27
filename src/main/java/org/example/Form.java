package org.example;

import org.example.exceptions.FormException;
import org.example.exceptions.WrongLoginException;
import org.example.exceptions.WrongPasswordException;

public class Form {
    private static String login;
    private static String password;
    private static String confirmPassword;

    public Form(String login, String password, String confirmPassword){
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public static boolean checkValidation() throws FormException {
        if(login.length() < 1 || login == null) {
            throw new WrongLoginException("Логин содержит недостаточно символов");
        } else if (login.length() >= 20) {
            throw new WrongLoginException("Слишком днинный логин, логин должен содержать менее 20 символов");
        }
        if(password.length() <1 || password == null){
            throw new WrongPasswordException("Пароль содержит недостаточно символов");
        } else if (password.length() >= 20) {
            throw new WrongPasswordException("Слишком днинный пароль, пароль должен содержать менее 20 символов");
        }
        if(!password.equals(confirmPassword)) throw new WrongPasswordException("Пароли не совпадают");

        return true;
    }
}
