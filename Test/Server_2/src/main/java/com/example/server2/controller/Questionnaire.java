package com.example.server2.controller;

import com.example.server2.entity.Product;
import com.example.server2.entity.Task;
import org.springframework.web.client.RestTemplate;

import java.util.List;


public class Questionnaire {
    static final String URL_GETTASK = "http://localhost:8080/api/getTask";
    private RestTemplate restTemplate;

    public Questionnaire() {
        getTask();
        restTemplate = new RestTemplate();
    }

    public void getTask() {
        Task result = restTemplate.getForObject(URL_GETTASK, Task.class);
         System.out.println(result.toString());
         Distributor distributor =new Distributor();
         List<Product> all= distributor.takeTask(result);
    }
}
