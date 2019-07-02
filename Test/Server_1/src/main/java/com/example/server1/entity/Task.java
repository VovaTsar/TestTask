package com.example.server1.entity;

import lombok.Data;

@Data
public class Task {
    private TypeOfTasks type;
    private Product product;

}
