package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home() {
        System.out.println("Navigating to home page");
        return "home";
    }

        @RequestMapping("/about")
    public String aboutPage() {
        System.out.println("Navigating to about page");
        return "about";
    }

        @RequestMapping("/services")
    public String services() {
        System.out.println("Navigating to services page");
        return "services";
    }

}
