package com.example.server2.entity;

public class Task {
    private TypeOfTasks type;
    private Product product;

    public Task() {
    }

    public TypeOfTasks getType() {
        return type;
    }

    public Product getProduct() {
        return product;
    }

    public void setType(TypeOfTasks type) {
        this.type = type;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Task{" +
                "type=" + type +
                ", product=" + product +
                '}';
    }
}
