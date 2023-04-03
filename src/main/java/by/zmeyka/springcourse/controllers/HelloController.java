package by.zmeyka.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {


    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", required = false) String name,
                        @RequestParam(value = "surname",required = false) String surname,
                        Model model){
        model.addAttribute("message","hello, "+name+" "+surname);
        return "hello";

    }

    @GetMapping("/bye")
    public String goodbye(){
    return "goodbye";}
}
