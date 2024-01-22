package com.amazon;

public class Order {
    private long id;

    private String description;

    private int quantity;

    private String nameOfTheOrder;

    public Order(long id, String description, int quantity, String nameOfTheOrder) {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.nameOfTheOrder = nameOfTheOrder;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getNameOfTheOrder() {
        return nameOfTheOrder;
    }

    public void setNameOfTheOrder(String nameOfTheOrder) {
        this.nameOfTheOrder = nameOfTheOrder;
    }

    public void submit(){
        System.out.println("Order{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", nameOfTheOrder='" + nameOfTheOrder + '\'' +
                '}');
    }


}
