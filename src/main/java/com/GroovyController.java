package com;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
@RestController
public class GroovyController {

    @GetMapping("/hello")
    public String exe() throws Exception {

        return "this is hello Jenkins";
    }

}