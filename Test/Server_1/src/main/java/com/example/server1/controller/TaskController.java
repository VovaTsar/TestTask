package com.example.server1.controller;


import com.example.server1.entity.Product;
import com.example.server1.entity.Task;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class TaskController {
    private List<Product> response;
    private Queue<Task> queue = new LinkedList<>();

    @PostMapping("/api/execute")
    public String execute(@RequestBody Task task) {
        queue.add(task);
        int count = 0;
        for (Task element : queue) {
            count++;
            System.out.println(count + element.toString());
        }
        while (response ==null){
        }
        List<Product> temp = response;
        response = null;
        return temp.toString();
    }

    @GetMapping("/api/getTask")
    public Task getTask() {
        return queue.poll();
    }

    @PostMapping("/api/putResult")
    public void putResult(@RequestBody List<Product> products) {
        response= new ArrayList<>(products);
        for (Product i : products) {
            System.out.println(i);
        }
    }
    
}