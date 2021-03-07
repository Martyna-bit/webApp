package com.example.demo.view;

import com.example.demo.service.FirstNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @Autowired
    private FirstNameService firstNameService;

    @GetMapping("home")
    public ModelAndView homeGet() {
        return new ModelAndView("home");
    }

    @PostMapping("home")
    public ModelAndView homePost(String firstName, Model model) {
        model.addAttribute("firstName", firstName);
        model.addAttribute("length", firstName.length());
        model.addAttribute("vowels", firstNameService.vowels(firstName));
        model.addAttribute("consonants", firstNameService.consonants(firstName));
        model.addAttribute("isMale", firstNameService.isMale(firstName));
        model.addAttribute("fromBehind", firstNameService.fromBehind(firstName));
        return new ModelAndView("home");
    }
}
