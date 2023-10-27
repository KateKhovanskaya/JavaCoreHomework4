package org.example.shop;

import org.example.exceptions.OrderCustomerException;
import org.example.exceptions.OrderException;
import org.example.exceptions.OrderProductNameException;
import org.example.exceptions.OrderProductQuantatyException;

import java.util.ArrayList;
import java.util.List;

public class BaseOfOrders {
    private static List<Order> orders;

    public BaseOfOrders() {
        this.orders = new ArrayList<Order>();
    }
    public BaseOfOrders(List<Order> orders) {
        this.orders = orders;
    }

    public static Order makePurchase (String customerFirstName, String productName, int quantaty,
                                     BaseOfCustomers baseOfCustomers, BaseOfproducts baseOfProducts){
        try {
            Customer customer = baseOfCustomers.getCustomerByName(customerFirstName);
            if (customer == null) throw new OrderCustomerException("Покупатель " + customerFirstName + " не найден");
            Product product = baseOfProducts.getProductByName(productName);
            if (product == null) throw new OrderProductNameException("Товар " + productName + " не найден");
            if (quantaty <= 0)
                throw new OrderProductQuantatyException("Количество товара не можеь быть отрицательным и нулевым");
            if (!product.isSalePossiible(quantaty))
                throw new OrderProductQuantatyException("Указанного количества товара " + productName + " нет в наличии, осталось " + product.getAvalibleQuantaty());
            Order order = new Order();
            order.setCustomer(customer);
            order.setProduct(product);
            order.setQuantaty(quantaty);
            product.setAvalibleQuantaty(product.getAvalibleQuantaty() - quantaty);
            orders.add(order);

            return order;
        }catch(OrderException e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static int getOrdersQuantaty(){
        return orders.size();
    }
}
