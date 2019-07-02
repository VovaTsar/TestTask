package com.example.server2.entity;

import lombok.Data;

@Data
public class Task {
    private TypeOfTasks type;
    private Product product;


    @Override
    public String toString() {
        return "Task{" +
                "type=" + type +
                ", product=" + product +
                '}';
    }
}
