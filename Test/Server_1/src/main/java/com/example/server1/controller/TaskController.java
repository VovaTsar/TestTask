package com.example.server1.controller;


import com.example.server1.entity.Product;
import com.example.server1.entity.Task;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class TaskController {
    private List<Product> result;
    private Queue<Task> queue = new LinkedList<>();

    @PostMapping("/api/execute")
    public void execute(@RequestBody Task task) {
        queue.add(task);
        int count = 0;
        for (Task element : queue) {
            count++;
            System.out.println(count + element.toString());
        }
    }

    @GetMapping("/api/getTask")
    public Task getTask() {
        return queue.poll();
    }

    @PostMapping("/api/putResult")
    public void putResult(@RequestBody List<Product> products) {
        result = new ArrayList<>(products);
        for (Product i : products) {
            System.out.println(i);
        }
    }

    @GetMapping("/api/execute")
    public String execute() {
        return result.toString();
    }

    @GetMapping("/api/putResult")
    public String putResult1() {
        //model.addAttribute("products",products);
        return result.toString();
        // return "redirect:/api/putResult";
    }
}
