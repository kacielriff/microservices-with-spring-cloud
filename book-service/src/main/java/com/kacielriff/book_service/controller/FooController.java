package com.kacielriff.book_service.controller;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book-service")
public class FooController {

    private static final Logger log =
            LoggerFactory.getLogger(FooController.class);


    @GetMapping("/foo")
//    @Retry(name = "bookService", fallbackMethod = "fallbackMethod")
//    @CircuitBreaker(name = "bookService", fallbackMethod = "fallbackMethod")
//    @RateLimiter(name = "bookService")
    @Bulkhead(name = "bookService")
    public String foobar() {
        log.info("Request to foo bar is received!");

        return "FooBar!!";
    }

    public String fallbackMethod(Exception ex) {
        return "Fallback Method FooBar!!";
    }
}
