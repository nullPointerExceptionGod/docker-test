package org.labs.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/service")
public class TestController {

    @GetMapping(value = "/test")
    public String test() {

        return "hello from service module controller";
    }

}
