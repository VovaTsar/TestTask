package com.example.server2.handler;

import com.example.server2.entity.Product;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class Sender {

    private RestTemplate restTemplate = new RestTemplate();
    private final String URL_RESULT = "http://localhost:8080/api/putResult";


    public Sender() {
    }

    public void sendResult(List<Product> product) {
        restTemplate.postForObject(
                URL_RESULT,
                product,
                ResponseEntity.class);
    }
}
