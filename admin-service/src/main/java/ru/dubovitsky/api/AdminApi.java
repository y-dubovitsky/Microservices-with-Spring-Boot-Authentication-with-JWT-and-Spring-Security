package ru.dubovitsky.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AdminApi {

    @GetMapping("/hello")
    public String getHelloWorld() {
        return "Hello World";
    }

}
