package com.example.server2.handler;

import com.example.server2.entity.Product;
import com.example.server2.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class Questionnaire {
    static final String URL_GET_TASK = "http://localhost:8080/api/getTask";
    private RestTemplate restTemplate = new RestTemplate();
    @Autowired
    private Distributor distributor;
    @Autowired
    private Sender sender;

    public Questionnaire() {
    }

    @PostConstruct
    public void getTask() {
        Task result = restTemplate.getForObject(URL_GET_TASK, Task.class);
        System.out.println(result.toString());

        List<Product> all = distributor.takeTask(result);
        sender.sendResult(all);
    }
}
