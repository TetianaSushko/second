package com.example.web;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpSessionRequiredException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {
    // for spring boot
//    @GetMapping("/hello")
//    public ModelAndView sayHello(){
//        return new ModelAndView("hello.html");
//    }

    //for spring
    @GetMapping("/helloFriend")

    public String helloPage(@RequestParam("name") String name,
                            @RequestParam ("surname") String surname, Model model){
//        System.out.println( "Hello, " + name + " " + surname);
       model.addAttribute("message", "Hello, " + name + " " + surname);
//        model.addAttribute("message", "Hello, " + name + " " + surname);
        return "helloFriend.html";
    }

    @GetMapping("/goodbye")
    public  String goodbyePage(){
        return "goodbye.html";
    }

    @GetMapping("/exit")
    public String exit(){
        return "exit.html";
    }

}
