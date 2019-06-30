package com.example.server2.controller;

import com.example.server2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

public class WorkController {
    static final String URL_GETTASK = "http://localhost:8080/api/getTask";
    RestTemplate restTemplate = new RestTemplate();

    @RequestMapping(value = "/template/products")
    public String getProductList() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity <String> entity = new HttpEntity<String>(headers);

        return restTemplate.exchange(URL_GETTASK, HttpMethod.GET, entity, String.class).getBody();
    }
}
