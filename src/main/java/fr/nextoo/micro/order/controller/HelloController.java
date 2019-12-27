package fr.nextoo.micro.order.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class HelloController {

    @GetMapping
    private ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello World!");
    }
}
