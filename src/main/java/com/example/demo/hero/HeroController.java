package com.example.demo.hero;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HeroController {

    @RequestMapping("/hero")
    public String index() {
        return "Hello Hero";
    }

}
