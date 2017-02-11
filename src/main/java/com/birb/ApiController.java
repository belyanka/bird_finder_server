package com.birb;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class ApiController {

    @RequestMapping(value = "/bird", method = RequestMethod.GET)
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
