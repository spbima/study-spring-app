package ru.devinfotools.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Ivanko Mike 20.07.2023
 */
@Controller
public class SecondController {
    @GetMapping("exit")
    public String exit() {
        return "second/exit";
    }
}
