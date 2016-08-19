package ua.org.calc.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/calc")
    public String calc() {
        return "calculator";
    }

    @RequestMapping("/calc2")
    public String calc2() {
        return "calculator2";
    }

    @RequestMapping("/calc3")
    public String calc3() {
        return "calculator3";
    }
}
