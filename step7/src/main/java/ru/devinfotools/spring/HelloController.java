package ru.devinfotools.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Ivanko Mike 20.07.2023
 */
@Controller
public class HelloController {
    @GetMapping("/hello-world")
    public String sayHello() {
        return "hello_world";
    }
}
