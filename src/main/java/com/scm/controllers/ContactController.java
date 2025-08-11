package com.scm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scm.entities.Contact;
import com.scm.entities.User;
import com.scm.forms.ContactForm;
import com.scm.helpers.Helper;
import com.scm.services.ContactService;
import com.scm.services.UserService;

@Controller
@RequestMapping("/user/contact")
public class ContactController {

    @Autowired
    ContactService contactService;

    @Autowired
    private UserService userService;

    @RequestMapping("/add")
    public String addContactView(Model model) {
        ContactForm contactForm = new ContactForm();
        contactForm.setName("Raj Singh");
        model.addAttribute("contactForm", contactForm);
        return "user/add_Contact";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String saveContact(@ModelAttribute ContactForm contactForm , Authentication authentication) {
        System.out.println("Contact saved: " + contactForm);

        String username = Helper.getEmailOfLoggedInUser(authentication);

         User user = userService.getUserByEmail(username);
        //form -- contact
        Contact contact = new Contact();
          contact.setName(contactForm.getName());
        contact.setFavorite(contactForm.isFavorite());
        contact.setEmail(contactForm.getEmail());
        contact.setPhoneNumber(contactForm.getPhoneNumber());
        contact.setAddress(contactForm.getAddress());
        contact.setDescription(contactForm.getDescription());
        contact.setUser(user);
        contact.setLinkedInLink(contactForm.getLinkedInLink());
        contact.setWebsiteLink(contactForm.getWebsiteLink());


        contactService.save(contact );
        return "redirect:/user/contacts/add";
    }

}
