package co.prime.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArticleController {

    @GetMapping("/article")
    public String requestViewPage(){
       return "page/article";
    }

}
