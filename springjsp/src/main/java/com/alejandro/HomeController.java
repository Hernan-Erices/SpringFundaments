package com.alejandro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")

    public String index(Model model) {
    	model.addAttribute("dojoName", "Hola, esto es un ejemplo");
        return "index.jsp";
    }
}