package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.scm.forms.ContactForm;

@Controller
@RequestMapping("/user/contact")
public class ContactController {

    @RequestMapping("/add")
    public String addContactView(Model model) {
        ContactForm contactForm = new ContactForm();
        contactForm.setName("Raj Singh");
        model.addAttribute("contactForm", contactForm);
        return "user/add_Contact";
    }

}
