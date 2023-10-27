package org.example.shop;

public class Order {
    private Customer customer;
    private Product product;
    private int quantaty;

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


    public void setQuantaty(int quantaty) {
        this.quantaty = quantaty;
    }
}
