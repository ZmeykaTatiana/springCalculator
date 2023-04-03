package by.zmeyka.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class CalculatorController {


    @GetMapping("/act")
    public String action(@RequestParam(value = "a",required = false) int a,
                         @RequestParam(value = "b",required = false) int b,
                         @RequestParam(value = "action", required = false)String action,
                         Model model){
        double result;

        switch (action){
            case "multipl": result=a*b;break;
            case "addition": result=a+b;break;
            case "sub": result=a-b;break;
            case "div":result=a/b;break;
            default:result=0;
        }
        model.addAttribute("a", a);
        model.addAttribute("b",b);
        model.addAttribute("action", action);
        model.addAttribute("result",result);


        return "result";

    }
}
