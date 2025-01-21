package com.example.SBejercicio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EjemploController {

    @GetMapping("/greet")
    public String greetInEnglish() {
        return "Hello there, I´m Erick and I´m learaning SpringBoot!";
    }
}
