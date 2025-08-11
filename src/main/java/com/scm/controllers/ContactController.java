package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String saveContact(@ModelAttribute ContactForm contactForm) {
        System.out.println("Contact saved: " + contactForm);
        return "redirect:/user/contacts/add";
    }

}
