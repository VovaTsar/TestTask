package com.example.server2.controller;

import com.example.server2.entity.Product;
import com.example.server2.entity.Task;
import com.example.server2.service.ProductService;

import java.util.List;

public class Distributor {
   private ProductService productService;

    public Distributor() {

    }
    public List<Product> takeTask(Task task){
        switch (task.getType()){
            case GetAll:{
                return  productService.getAll();
            }
            case Create:{
              productService.create(task.getProduct());
              return productService.getAll();
            }
            case Remove:{
                productService.remove(task.getProduct().getId());
                return productService.getAll();
            }
            case Update:{
                productService.update(task.getProduct().getId(),task.getProduct());
                productService.getAll();
            }
        }
        return null;
    }
}
