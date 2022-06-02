package com.bootdo.testDemo;


public class Book {
    private Integer price;
    private String name;
    private final int value = 0;

    public Book(Integer price, String name) {
        this.price = price;
        this.name = name;
        int value =  9;
    }

    public Book() {
        int value =   2;

        value++;

        System.out.println(value);
        System.out.println(this.value);
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
