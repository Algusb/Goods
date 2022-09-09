package ru.netology;

public class Smartphone extends Product {
    protected String maker;

    public Smartphone(int productId, String productName, int productPrice, String maker) {
        super(productId, productName, productPrice);
        this.maker = maker;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }
}
