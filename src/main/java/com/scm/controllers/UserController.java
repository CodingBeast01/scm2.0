package com.scm.controllers;

import org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.scm.helpers.Helper;


@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value ="/dashboard", method=RequestMethod.GET)
    public String userDashboard() {
        return "user/dashboard";
    }

    @RequestMapping(value ="/profile", method=RequestMethod.GET)
    public String userProfile(Authentication authentication) {
       // String email = Helper.getEmailOfLoggedInUser(authentication);
        // Use the email as needed
        return "user/profile";
    }
    



}
