package com.amazon;

public class OrderServiceImpl implements OrderService{
    private int quantity;

    private double price;

    private String rating;

    public OrderServiceImpl(int quantity, double price, String rating) {
        this.quantity = quantity;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public void availableQuantity() {
        System.out.println(quantity);
    }

    @Override
    public void price() {
        System.out.println(price);
    }

    @Override
    public void rating() {
        System.out.println(rating);
    }

    @Override
    public void submitOrder() {
        System.out.println("Placed order successfully");
    }
}
