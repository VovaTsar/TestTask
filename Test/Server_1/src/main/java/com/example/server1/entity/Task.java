package com.example.server1.entity;



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

    public Task(String type) {
        switch (type) {
            case ("GetAll"): {
                this.type = TypeOfTasks.GetAll;
                break;
            }
            case ("Create"): {
                this.type = TypeOfTasks.Create;
                break;
            }
            case ("Update"): {
                this.type = TypeOfTasks.Update;
                break;
            }
            case ("Remove"): {
                this.type = TypeOfTasks.Remove;
                break;
            }
        }
    }
}
