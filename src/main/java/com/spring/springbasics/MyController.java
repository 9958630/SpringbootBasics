package com.spring.springbasics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/getDetails")
    public String getDetails(){
        return "Detials";

    }

}
