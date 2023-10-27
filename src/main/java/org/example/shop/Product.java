package org.example.shop;

public class Product {
    private String name;
    private int avalibleQuantaty;

    public Product(String name, int avalibleQuantaty) {
        this.name = name;
        this.avalibleQuantaty = avalibleQuantaty;
    }

    public String getName() {
        return name;
    }

    public int getAvalibleQuantaty() {
        return avalibleQuantaty;
    }

    public void setAvalibleQuantaty(int avalibleQuantaty) {
        this.avalibleQuantaty = avalibleQuantaty;
    }

    public boolean isSalePossiible(int quantaty){
        return this.avalibleQuantaty >= quantaty;
    }
}
