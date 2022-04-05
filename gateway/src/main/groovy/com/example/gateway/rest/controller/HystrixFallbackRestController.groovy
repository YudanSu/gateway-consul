package com.example.gateway.rest.controller

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class HystrixFallbackRestController {

    @GetMapping("/api/fallback")
    public Mono<String> getFxSvcMsg() {
        return Mono.just("No response from Book Billing Service and will be back shortly");
    }

    @GetMapping("/*/fallback")
    public Mono<String> getCcSvcMsg() {
        return Mono.just("No response from Book Service and will be back shortly");
    }

}