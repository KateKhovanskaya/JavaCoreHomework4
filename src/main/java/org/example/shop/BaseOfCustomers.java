package org.example.shop;

import java.util.ArrayList;
import java.util.List;

public class BaseOfCustomers {
    private List<Customer> customers;

    public BaseOfCustomers() {
        this.customers = new ArrayList<Customer>();
    }
    public BaseOfCustomers(List<Customer> customers) {
        this.customers = customers;
    }
    public void addCustomer(String firstName){
        customers.add(new Customer(firstName));
    }
    public Customer getCustomerByName(String customerFirstName){
        for (Customer customer:customers) {
            if(customer.getFirstname() == customerFirstName) return customer;
        }
        return null;
    }
}
