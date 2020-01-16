package com.example.data.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/data")
public class TestDataController {

    @GetMapping(value = "/test")
    public String test() {
        return "hello from data module controller";
    }
}
