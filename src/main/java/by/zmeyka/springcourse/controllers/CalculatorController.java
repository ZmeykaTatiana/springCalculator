package by.zmeyka.springcourse.controllers;

import by.zmeyka.springcourse.Model.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller

public class CalculatorController {


    @GetMapping("/act")
    public String action(Model model){
        model.addAttribute("calculator",new Calculator());
        return "new";

    }


    @PostMapping  ("/result")
    public String makeCalculation(@ModelAttribute("calculator") Calculator calculator, Model model) {

        double result;
        int a=calculator.getA();
        int b=calculator.getB();
        String action=calculator.getAction();

        switch (calculator.getAction()){
            case "multiplication": result=a*b;break;
            case "addition": result=a+b;break;
            case "sub": result=a-b;break;
            case "division":result=a/b;break;
            default:result=0;
        }

        model.addAttribute("result",result);


        return "result";
    }
}
