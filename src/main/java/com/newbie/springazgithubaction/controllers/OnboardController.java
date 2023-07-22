package com.newbie.springazgithubaction.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.Map;

@RestController
@RequestMapping("/api/1.0/onboard")
public class OnboardController {
    @GetMapping("/welcome")
    Mono<Map<String, Object>> welcome() {
        return Mono.just(Map.of("success", "true", "message", "welcome newbie"));
    }

}
