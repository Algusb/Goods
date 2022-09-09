package ru.netology;

public class Book extends Product {

    protected String author;

    public Book(int productId, String productName, int productPrice, String author) {
        super(productId, productName, productPrice);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
