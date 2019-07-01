package com.example.server1.controller;


import com.example.server1.entity.Result;
import com.example.server1.entity.Task;

import com.example.server1.entity.TypeOfTasks;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.logging.Logger;

@RestController

public class TaskController {
    private Queue<Task> queue = new LinkedList<>();

//    @RequestMapping("/getString")
//    public String getString()
//    {
//        return "Hello World";
//    }


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
    public Result putResult() {
        return null;
    }
}
