package by.unil2.itstep.taskSpring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskController {

    @GetMapping("/")
    public String anyPage(){
        System.out.println("any");
        return "anypage.html";
        }










    }//TaskController
