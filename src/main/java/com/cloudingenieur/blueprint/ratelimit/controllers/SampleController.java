package com.cloudingenieur.blueprint.ratelimit.controllers;


import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RateLimiter(name = "backendA")
public class SampleController {

   // @RateLimiter(name = "backendA")
    @GetMapping("/messageA")
    public String getMessageA() {
        return "Message from backend A";
    }

   // @RateLimiter(name = "backendA")
    @GetMapping("/messageA2")
    public String getMessageA2() {
        return "Message from backend A2";
    }

    //@RateLimiter(name = "backendB")
    @GetMapping("/messageB")
    public String getMessageB() {
        return "Message from backend B";
    }

    //@RateLimiter(name = "backendC")
    @GetMapping("/messageC")
    public String getMessageC() {
        return "Message from backend C which uses default RateLimiter configuration";
    }
}