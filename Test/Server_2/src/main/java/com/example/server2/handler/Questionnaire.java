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
    private Task nextTask;

    public Questionnaire() {
        nextTask = restTemplate.getForObject(URL_GET_TASK, Task.class);
    }

    @PostConstruct
    public void getTask() {
        if (nextTask != null) {
            System.out.println(nextTask.toString());
            List<Product> all = distributor.takeTask(nextTask);
            sender.sendResult(all);
            nextTask = restTemplate.getForObject(URL_GET_TASK, Task.class);
        }
        while (nextTask == null) {
            nextTask = restTemplate.getForObject(URL_GET_TASK, Task.class);
        }
        getTask();
    }

}
