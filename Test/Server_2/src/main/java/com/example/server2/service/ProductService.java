package com.example.server2.service;

import com.example.server2.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();

    void create( Product product);

    void update( int id,Product product);

    void remove( int id);
}
