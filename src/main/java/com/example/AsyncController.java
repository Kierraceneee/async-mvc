package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/api")
public class AsyncController {

    @Autowired


    @GetMapping("/async-task")
    public CompletableFuture<String> fetchDataAsync() throws InterruptedException {
        return AsyncService.fetchData();
    }
}
