package org.example.shop;

import java.util.ArrayList;
import java.util.List;

public class BaseOfproducts {
    private List<Product> products;

    public BaseOfproducts() {
        this.products = new ArrayList<Product>();
    }
    public BaseOfproducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product prod){
        products.add(prod);
    }
    public void addProduct(String name, int quantaty){
        products.add(new Product(name, quantaty));
    }

    public Product getProductByName(String productName){
        for (Product product:products) {
            if(product.getName() == productName) return product;
        }
        return null;
    }
}
