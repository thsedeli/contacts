package com.rolepoint.contacts;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller
public class ContactsController {

    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("person", new Person());
        return "form";
    }

    @PostMapping("/search")
    public String search(@ModelAttribute Person person, Model model) {
        if (person == null) {
            model.addAttribute("results", new PersonService().findAll());
        } else {
            model.addAttribute("results", new PersonService().findPerson(person));
        }
        return "result";
    }
}
