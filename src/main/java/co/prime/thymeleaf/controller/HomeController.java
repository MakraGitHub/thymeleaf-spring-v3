package co.prime.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping
    public String requestViewPage(Model model){
        model.addAttribute("app","spring boot");
        return "page/index";
    }
}
