package com.birb;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ApiController {

    @RequestMapping("/birds")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
