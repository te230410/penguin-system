package com.example.penguin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class TestController {

    @GetMapping("/")
    public String index() {
        return "Hello Spring!";
    }
}