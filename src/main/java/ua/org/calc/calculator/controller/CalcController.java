package ua.org.calc.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/calculate")
public class CalcController {

    @ResponseBody
    @RequestMapping("/{action}/")
    public float add(@PathVariable String action, @RequestParam int first, @RequestParam int second) {
        switch (action) {
            case "1":
                return first + second;
            case "2":
                return first - second;
            case "3":
                return first * second;
            case "4":
                return (float) first / second;
        }
        return 0;
    }
}
