package com.scm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.scm.entities.User;
import com.scm.helpers.Helper;
import com.scm.services.UserService;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    


    @RequestMapping(value ="/dashboard", method=RequestMethod.GET)
    public String userDashboard() {
        return "user/dashboard";
    }

    @RequestMapping(value ="/profile", method=RequestMethod.GET)
    public String userProfile( Model model ,Authentication authentication) {
       // String email = Helper.getEmailOfLoggedInUser(authentication);
        // Use the email as needed
        // User user = userService.getUserByEmail(email);
        // model.addAttribute("loggedInUser", user);
        return "user/profile";
    }
    



}
