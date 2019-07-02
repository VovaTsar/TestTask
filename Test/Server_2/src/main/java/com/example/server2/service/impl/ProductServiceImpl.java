package com.example.server2.service.impl;

import com.example.server2.entity.Product;
import com.example.server2.repository.ProductRepository;
import com.example.server2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public void create(Product product) {
        productRepository.save(product);
    }

    @Override
    public void update(int id, Product product) {
        Product found = productRepository.findById(id);
        found.setName(product.getName());
        productRepository.save(found);
    }

    @Override
    public void remove(int id) {
        Product found = productRepository.findById(id);
        productRepository.delete(found);
    }
}
