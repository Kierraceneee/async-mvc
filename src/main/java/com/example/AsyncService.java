package com.example;


import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class AsyncService {
@Async
    public static CompletableFuture<String> fetchData() throws InterruptedException{
    Thread.sleep(5000); // Simulating delay
    return CompletableFuture.completedFuture("All done here.");
}
}
