package br.edu.infnet.awsdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.infnet.awsdemo.model.AmazonClient;

@Controller
public class HomeController {

    @Autowired
    private AmazonClient amazonClient;

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("images", this.amazonClient.getObjects());
        return "home";
    }
}