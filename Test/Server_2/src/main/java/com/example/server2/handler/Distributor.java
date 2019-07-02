package com.example.server2.handler;

import com.example.server2.entity.Product;
import com.example.server2.entity.Task;

import com.example.server2.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Distributor {
    @Autowired
    private ProductServiceImpl productService;


    public Distributor() {

    }

    public List<Product> takeTask(Task task) {
        switch (task.getType()) {
            case GetAll: {
                return productService.getAll();

            }
            case Create: {
                productService.create(task.getProduct());
                return productService.getAll();
            }
            case Remove: {
                productService.remove(task.getProduct().getId());
                return productService.getAll();
            }
            case Update: {
                productService.update(task.getProduct().getId(), task.getProduct());
                return productService.getAll();
            }
        }
        return productService.getAll();
    }
}
