package org.example;

import org.example.exceptions.OrderException;
import org.example.exceptions.WrongLoginException;
import org.example.exceptions.WrongPasswordException;
import org.example.shop.BaseOfCustomers;
import org.example.shop.BaseOfOrders;
import org.example.shop.BaseOfproducts;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//        1. Задача: Проверка логина и пароля

        Form form = new Form("логин", "jfhdjd", "jfhdjd");
        try{
            System.out.println(form.checkValidation());
        }catch(WrongLoginException e){
            System.out.println(e.getMessage());
        }catch(WrongPasswordException e){
            System.out.println(e.getMessage());
        }

//        2. Задача: Эмуляция интернет-магазина

        BaseOfCustomers baseOfCustomers = new BaseOfCustomers();
        baseOfCustomers.addCustomer("Иван");
        baseOfCustomers.addCustomer("Мария");

        BaseOfproducts baseOfProducts = new BaseOfproducts();
        baseOfProducts.addProduct("Мяч", 3);
        baseOfProducts.addProduct("Платье красное", 1);

        BaseOfOrders baseOfOrders = new BaseOfOrders();

        BaseOfOrders.makePurchase("Иван", "Мяч", 2, baseOfCustomers, baseOfProducts);
        BaseOfOrders.makePurchase("Мария", "Мяч", 1, baseOfCustomers, baseOfProducts);
        BaseOfOrders.makePurchase("Мария", "Платье красное", 1, baseOfCustomers, baseOfProducts);


        System.out.println("Совершено " + BaseOfOrders.getOrdersQuantaty() + " покупок");
    }
}