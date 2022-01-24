package com.alejandro;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(HttpSession session){

        session.setAttribute("count", 0);
        Integer count = (Integer) session.getAttribute("count");
		return "hola";

    }
}