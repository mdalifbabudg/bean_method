package com.example.beanmethod.config;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MyController {

    private final MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping
    public ResponseEntity<String> myMessage(){
        return ResponseEntity.ok(myService.usMyBean());
    }
}
