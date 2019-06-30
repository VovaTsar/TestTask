package com.example.server1.controller;


import com.example.server1.entity.Result;
import com.example.server1.entity.Task;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.logging.Logger;

@RestController
@RequestMapping("api")
public class TaskController {
    private Queue<Task> queue = new LinkedList<>();
  //  private static final Logger logger=Logger.getAnonymousLogger();

@PostMapping("/api/execute")
    public void execute(@RequestBody Task task){
    queue.add(task);
    for(Task t1 :queue){
        System.out.println(t1);
    }
}
@GetMapping("/api/getTask")
    public Task getTask(){
    return queue.poll();
}
    @GetMapping("/api/putResult")
    public Result putResult(){
    return null;
    }
}
